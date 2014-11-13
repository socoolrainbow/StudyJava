package chapter9_Thread;

public class ThreadSample12 implements Runnable
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread th = new Thread(new ThreadSample12());
        th.start();
        
        Thread.sleep(50);
        th.interrupt();
    }
    @Override
    public void run()
    {
        // interrupte�� �ɸ��� ����.
        while (!Thread.interrupted())
        {
            System.out.println("is running...");
            for (int i = 0; i < 10000000; i++)
            {
                
            }
        }
        System.out.println("terminated!");
    }
}
