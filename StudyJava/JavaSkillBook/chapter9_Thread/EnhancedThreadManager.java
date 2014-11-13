package chapter9_Thread;

import java.util.LinkedList;
// 잡업량이 정해져있지않고, 언제 작업이 발생할지 모르는 예측할수없는 상황을 처리하는 코드
// Interrupt방식의 스레드처리 방식으로 짜여져있다.
// wait()메서드와, notify()메서드를 이용해 일이 생성되면 notify()를 통해 consumer스레드를 호출하여 처리하고, 없는 경우에는 wait()를 통해
// cunsumer스레드를 대기 상태로 만들어 시스템자원을 효율적으로 사용하는 방법이다.
public class EnhancedThreadManager
{
    public static void main(String[] args)
    {
        EnhancedResourceQueue queue = new EnhancedResourceQueue();
        Thread producer = new Thread(new EnhancedProducer(queue), "Producer");
        Thread consumer1 = new Thread(new EnhancedConsumer(queue),"Consumer1");
        Thread consumer2 = new Thread(new EnhancedConsumer(queue),"Consumer2");
        
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class EnhancedProducer implements Runnable
{
    private EnhancedResourceQueue queue;
    public EnhancedProducer(EnhancedResourceQueue queue)
    {
        this.queue = queue;
    }
    @Override
    // 생산자는 folling방식과 같이 돌아간다.
    public void run()
    {
        for (int i = 0; i < 10 && !Thread.interrupted(); i++)
        {
            queue.put(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Jobs Complete!");
    }
}

class EnhancedConsumer implements Runnable
{
    private EnhancedResourceQueue queue;
    public EnhancedConsumer(EnhancedResourceQueue queue)
    {
        this.queue = queue;
    }
    
    // 소비자또한 folling방식과 다르지않게 진행된다.
    @Override
    public void run()
    {
        while (!Thread.interrupted())
        {
            try
            {
                Integer res = (Integer)queue.pop();
                if (res != null)
                {
                    System.out.println(Thread.currentThread().getName() + " pop : " + res);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
}

class EnhancedResourceQueue
{
    private LinkedList<Object> jobs = new LinkedList<Object>();
    
    public synchronized void clear()
    {
        jobs.clear();
    }
    // folling방식과는 다르게 Interrupt방식으로 jobs이 있을경우 삭제하고, 없을경우에는 호출한 해당스레드를 wait()메서드를 이용해 대기시킨다.
    public synchronized Object pop() throws InterruptedException
    {
        Object o = null;
        if (jobs.isEmpty())
        {
            this.wait();
        }
        o = jobs.removeFirst();
        
        return o;
    }
    
    // Interrupt방식으로 put()메서드를 이용해 작업을 추가하고, 정지돼있는 Thread를 notify()메서드를 호출하여 wait()상태의 스레드를 실행시킨다.
    public synchronized void put(Object o)
    {
        jobs.addLast(o);
        this.notify();
    }
}