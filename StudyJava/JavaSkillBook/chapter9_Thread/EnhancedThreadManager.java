package chapter9_Thread;

import java.util.LinkedList;
// ������� �����������ʰ�, ���� �۾��� �߻����� �𸣴� �����Ҽ����� ��Ȳ�� ó���ϴ� �ڵ�
// Interrupt����� ������ó�� ������� ¥�����ִ�.
// wait()�޼����, notify()�޼��带 �̿��� ���� �����Ǹ� notify()�� ���� consumer�����带 ȣ���Ͽ� ó���ϰ�, ���� ��쿡�� wait()�� ����
// cunsumer�����带 ��� ���·� ����� �ý����ڿ��� ȿ�������� ����ϴ� ����̴�.
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
    // �����ڴ� folling��İ� ���� ���ư���.
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
    
    // �Һ��ڶ��� folling��İ� �ٸ����ʰ� ����ȴ�.
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
    // folling��İ��� �ٸ��� Interrupt������� jobs�� ������� �����ϰ�, ������쿡�� ȣ���� �ش罺���带 wait()�޼��带 �̿��� ����Ų��.
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
    
    // Interrupt������� put()�޼��带 �̿��� �۾��� �߰��ϰ�, �������ִ� Thread�� notify()�޼��带 ȣ���Ͽ� wait()������ �����带 �����Ų��.
    public synchronized void put(Object o)
    {
        jobs.addLast(o);
        this.notify();
    }
}