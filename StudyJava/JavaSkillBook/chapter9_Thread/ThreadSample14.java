package chapter9_Thread;

public class ThreadSample14 implements Runnable
{
    public static void main(String[] args)
    {
        Thread th = new Thread(new ThreadSample14());
        // �ش� thread�� deamon���� ����
        // Thread�� �ٸ� �����尡 ������ ���������� thread���� ó���ǳ�. daemon���� �����ϸ� ���ν����尡 ������ ���� ����ȴ�.
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
