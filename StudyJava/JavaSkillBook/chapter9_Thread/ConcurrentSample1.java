package chapter9_Thread;

public class ConcurrentSample1 implements Runnable
{
    private int count = 0;
    
    public static void main(String[] args)
    {
        ConcurrentSample1 concurrent = new ConcurrentSample1();
        Thread th1 = new Thread(concurrent);
        Thread th2 = new Thread(concurrent);
        
        th1.start();
        th2.start();
        
        try
        {
            // wait
            th1.join();
            th2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(concurrent.count);
        
    }
    
    @Override
    public void run()
    {
        sum();
    }
    
    private void sum()
    {
        for (int i = 0; i < 10000; i++)
        {
            count++;
        }
    }
}
