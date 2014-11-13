package chapter9_Thread;

import java.util.LinkedList;


// ����ȭ ó������߿� folling ��İ� Interrupt ����� �ִ�.
// ���� �Ʒ��� �ڵ�� folling������� ������(producer)�� �ϳ��� ResourceQueue�� �����͸� �װ�, �Һ���(Consumer)�� �׿��ִ� �ϵ��� ó���ϴ� �ڵ�μ�
// folling����� ����ؼ� ���� �ִ��� �������� ����ؼ� �����ϸ鼭 �Һ��ϴ� ó��������� ���ҽ��� ���� ����ϸ� �ɷ������� ���� ����̴�.
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
        // ������� �ʴ��̻� ��� ���� �ִ����� Ȯ���ϰ� �Һ��ϰ� �ȴ�.
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