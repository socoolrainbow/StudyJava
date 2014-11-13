package chapter9_Thread;

public class ThreadGroupSample3 implements Runnable
{
    public static void main(String[] args)
    {
        new Thread(new ThreadGroupSample3(), "ThreadGroupSample3").start();
        
        // ������׷��� �����ϰ�, ������׷쿡�� ���� �������� �����尳����ŭ�� �迭������ ���� ������迭�� ���� 
        ThreadGroup thGroup = Thread.currentThread().getThreadGroup();
        Thread[] thArr = new Thread[thGroup.activeCount()];
        
        // ������ �迭 ��ü�� enumerate() �޼ҵ��� �Ű������� ������ �޼ҵ� ���ο��� �迭 ��ü�� ��� ��ü�� �־��ش�.
        thGroup.enumerate(thArr);
        
        for (Thread th : thArr)
        {
            System.out.println(th.getName());
        }
        
    }
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
//            break;
        }
    }
}
