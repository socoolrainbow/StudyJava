package chapter9_Thread;

// main�����尡 ����Ǵ��� childThread�� ��� ����ȴ�.
// ���μ����� ������ �������� �ʴ��̻� ChildThread�� run()�޼ҵ尡 ����ɶ����� ����ȴ�.
public class ChildThread implements Runnable 
{
    public static void main(String[] args)
    {
        Thread th = new Thread(new ChildThread());
        th.start();
        
        System.out.println("Main thread is done.");
    }

    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("is running...");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
