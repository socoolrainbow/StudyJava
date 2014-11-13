package chapter9_Thread;

public class ThreadSample14 implements Runnable
{
    public static void main(String[] args)
    {
        Thread th = new Thread(new ThreadSample14());
        // 해당 thread를 deamon으로 설정
        // Thread는 다른 스레드가 끝나도 독립적으로 thread들이 처리되나. daemon으로 설정하면 메인스레드가 끝날때 같이 종료된다.
        th.setDaemon(true);
        th.start();
        
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        System.out.println("Main thread terminated.");
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
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
                // TODO: handle exception
            }
        }
    }
    
}
