package chapter9_Thread;

// main스레드가 종료되더라도 childThread는 계속 실행된다.
// 프로세스를 강제로 종료하지 않는이상 ChildThread의 run()메소드가 종료될때까지 실행된다.
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
