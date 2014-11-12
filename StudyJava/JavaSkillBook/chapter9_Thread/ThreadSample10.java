package chapter9_Thread;

public class ThreadSample10 implements Runnable
{
    // 실행결과를 보면 3출력이후 0.5초후에 10으로 우선순위가 변경되고 계속해서 10으로 우선순위가 고정돼어 무한반복된다.
    // 그 이유는 main()메소드에서 스레드가 0.5초 쉬는 동안 run()메소드가 5번 실행되고, main메소드의
    // setPriority(10) 메소드가 실행되었기 때문이다.
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
