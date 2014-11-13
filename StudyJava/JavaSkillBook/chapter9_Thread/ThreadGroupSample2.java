package chapter9_Thread;

public class ThreadGroupSample2 implements Runnable
{
    public static void main(String[] args)
    {
        // 자신의 클래스의 스레드를 인스턴스하고 start시킨다.
        new Thread(new ThreadGroupSample2()).start();
        
        // 현제 스레드객체에 속한 thGroup을 인스턴스화한다.
        ThreadGroup thGroup = new Thread().currentThread().getThreadGroup();
        // 그룹에 속한 모든 객체에 인터럽트가 발행한다.
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
