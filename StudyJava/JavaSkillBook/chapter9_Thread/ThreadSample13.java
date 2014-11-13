package chapter9_Thread;

public class ThreadSample13 implements Runnable
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread th = new Thread(new ThreadSample13());
        th.start();
        
        Thread.sleep(500);
        th.interrupt();
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        while (true)
        {
            System.out.println("is running...");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                // interrupt발생시 에러메시지 출력후 종료
                e.printStackTrace();
                break;
            }
            System.out.println("terminated!");
        }
    }
}
