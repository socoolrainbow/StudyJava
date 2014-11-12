package chapter9_Thread;

public class ThreadSemple8 implements Runnable
{
    public static void main(String[] args)
    {
        Thread th1 = new Thread(new ThreadSemple8());
        th1.start();
        th1.start();
        
        // �ϳ��� ������ Thread�ν��Ͻ���ü�� �ι� ȣ���Ҷ� ������ Runnable���׿��� Running���·� ��������Ŀ�
        // Strat�� �ٽ� ȣ��������
        // ���������� Exeption�� �߻��Ѵ�.
        // Exception in thread "main" java.lang.IllegalThreadStateException
        // at java.lang.Thread.start(Thread.java:705)
        // at chapter9_Thread.ThreadSemple8.main(ThreadSemple8.java:9)
    }
    
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("running....");
            try
            {
                // milleSecons�̹Ƿ� 1000�� 1��, ���� 5�ʰ� ����.
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
            }
        }
    }
}
