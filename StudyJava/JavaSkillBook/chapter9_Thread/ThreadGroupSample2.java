package chapter9_Thread;

public class ThreadGroupSample2 implements Runnable
{
    public static void main(String[] args)
    {
        // �ڽ��� Ŭ������ �����带 �ν��Ͻ��ϰ� start��Ų��.
        new Thread(new ThreadGroupSample2()).start();
        
        // ���� �����尴ü�� ���� thGroup�� �ν��Ͻ�ȭ�Ѵ�.
        ThreadGroup thGroup = new Thread().currentThread().getThreadGroup();
        // �׷쿡 ���� ��� ��ü�� ���ͷ�Ʈ�� �����Ѵ�.
        thGroup.interrupt();
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
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
                e.printStackTrace();
                break;
            }
        }
    }
}
