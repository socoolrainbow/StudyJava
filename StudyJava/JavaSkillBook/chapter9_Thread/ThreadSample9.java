package chapter9_Thread;

public class ThreadSample9 implements Runnable
{
    private String mark;
    
    public ThreadSample9(String mark)
    {
        this.mark = mark;
    }
    public static void main(String[] args)
    {
        Thread th_pr1 = new Thread(new ThreadSample9("-"),"Pr1");
        Thread th_pr5 = new Thread(new ThreadSample9("/"),"Pr5");
        Thread th_pr10 = new Thread(new ThreadSample9("*"),"Pr10");
        
        th_pr1.setPriority(Thread.MIN_PRIORITY);;
        th_pr5.setPriority(Thread.NORM_PRIORITY);
        th_pr10.setPriority(Thread.MAX_PRIORITY);
        
        th_pr1.start();
        th_pr5.start();
        th_pr10.start();
    }
    @Override
    public void run()
    {
        for (int i = 0; i < 200; i++)
        {
            System.out.print(mark);

            // �۾�����...
            // �̷��� �����ڵ�� �������� ���¸� ��Ȯ�ϰ� �������� ���ϴ� �����̹Ƿ� ����� �������ʴ´�.
            for (int j = 0; j < 10000; j++)
            {
            }
        }
        System.out.print(Thread.currentThread().getName() + " done");
    }
}
