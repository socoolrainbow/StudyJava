package chapter9_Thread;

public class ThreadSample10 implements Runnable
{
    // �������� ���� 3������� 0.5���Ŀ� 10���� �켱������ ����ǰ� ����ؼ� 10���� �켱������ �����ž� ���ѹݺ��ȴ�.
    // �� ������ main()�޼ҵ忡�� �����尡 0.5�� ���� ���� run()�޼ҵ尡 5�� ����ǰ�, main�޼ҵ���
    // setPriority(10) �޼ҵ尡 ����Ǿ��� �����̴�.
    public static void main(String[] args)
    {
        Thread th = new Thread(new ThreadSample10());
        th.setPriority(3);
        th.start();
        
        try
        {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        th.setPriority(10);
        // try
        // {
        // Thread.sleep(500);
        // }
        // catch (InterruptedException e)
        // {
        // e.printStackTrace();
        // }
        // th.setPriority(5);
        
    }
    
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Priority : "
                    + Thread.currentThread().getPriority());
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
