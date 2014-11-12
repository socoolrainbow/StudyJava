package chapter9_Thread;

public class ThreadSemple8 implements Runnable
{
    public static void main(String[] args)
    {
        Thread th1 = new Thread(new ThreadSemple8());
        th1.start();
        th1.start();
        
        // 하나의 생성된 Thread인스턴스객체를 두번 호출할때 그전에 Runnable상테에서 Running상태로 변경된이후에
        // Strat를 다시 호출함으로
        // 다음과같은 Exeption이 발생한다.
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
                // milleSecons이므로 1000이 1초, 따라서 5초간 슬립.
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                // TODO: handle exception
            }
        }
    }
}
