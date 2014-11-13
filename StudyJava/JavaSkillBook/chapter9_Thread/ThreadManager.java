package chapter9_Thread;

import java.util.LinkedList;


// 동기화 처리방식중에 folling 방식과 Interrupt 방식이 있다.
// 이중 아래의 코드는 folling방식으로 생산자(producer)가 하나의 ResourceQueue에 데이터를 쌓고, 소비자(Consumer)가 쌓여있는 일들을 처리하는 코드로서
// folling방식인 계속해서 일이 있는지 없는지를 계속해서 갱신하면서 소비하는 처리방식으로 리소스를 많이 사용하며 능률적이지 못한 방식이다.
public class ThreadManager
{
    public static void main(String[] args)
    {
        ResourceQueue queue = new ResourceQueue();
        Thread producer = new Thread(new Producer(queue), "producer");
        Thread consumer1 = new Thread(new Consumer(queue), "consumer1");
        Thread consumer2 = new Thread(new Consumer(queue), "consumer2");
        
        producer.start();
        consumer1.start();
        consumer2.start();
    }
}

class Producer implements Runnable
{
    private ResourceQueue queue;
    
    public Producer(ResourceQueue queue)
    {
        this.queue = queue;
    }
    
    @Override
    public void run()
    {
        for (int j = 0; j < 10; j++)
        {
            queue.put(j);
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
        System.out.println("produce complete.");
    }
}

class Consumer implements Runnable
{
    private ResourceQueue queue;
    
    public Consumer(ResourceQueue queue)
    {
        this.queue = queue;
    }
    
    @Override
    public void run()
    {
        // 종료돼지 않는이상 계속 일이 있는지를 확인하고 소비하게 된다.
        while (!Thread.interrupted())
        {
            try
            {
                Integer res = (Integer) queue.pop();
                if (res != null)
                {
                    System.out.println(Thread.currentThread().getName()
                            + " pop : " + res);
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

class ResourceQueue
{
    private LinkedList<Object> jobs = new LinkedList<Object>();
    
    public synchronized void clear()
    {
        jobs.clear();
    }
    
    public synchronized Object pop() throws InterruptedException
    {
        Object o = null;
        if (!jobs.isEmpty())
        {
            
            o = jobs.removeFirst();
        }
        return o;
    }
    
    public void put(Object o)
    {
        jobs.addLast(o);
    }
    
}