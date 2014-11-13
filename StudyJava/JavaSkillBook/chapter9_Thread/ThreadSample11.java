package chapter9_Thread;

public class ThreadSample11 implements Runnable
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread th = new Thread(new ThreadSample11());
        th.start();
        
        Thread.sleep(50);
        
        // interrupt¹ß»ý
        th.interrupt();
    }
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("is runnning... " + Thread.interrupted());
            for (int i = 0; i < 10000000; i++)
            {
                
            }
        }
    }
}
