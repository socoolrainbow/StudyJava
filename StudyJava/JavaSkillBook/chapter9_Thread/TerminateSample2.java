package chapter9_Thread;

public class TerminateSample2 implements Runnable
{
    private boolean isAlive = true;
    
    public static void main(String[] args)
    {
        Thread test = new Thread(new TerminateSample2(), "TEST");
        test.start();
        
        System.out.println("Press Ctrl + C to Exit");
    }
    
    public void shutdown()
    {
        System.out.println("[" + Thread.currentThread().getName()
                + "] called shutdown");
        isAlive = false;
    }
    
    @Override
    public void run()
    {
        String thName = Thread.currentThread().getName();
        // ShutDownHook 클래스는 스레드가 종료 될때 특정 작업을 하기 위한 장치이다.
        Thread shutDownHook = new ShutDownHook(Thread.currentThread(),"Shutdown");
        Runtime.getRuntime().addShutdownHook(shutDownHook);
        
        while (isAlive)
        {
            System.out.println("Test is Running");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
            }
            System.out.println("End of procedure");
        }
        System.out.println(thName + " is terminated");
    }
    
    private class ShutDownHook extends Thread
    {
        private Thread target;
        
        public ShutDownHook(Thread target, String name)
        {
            super(name);
            this.target = target;
        }
        
        @Override
        public void run()
        {
            shutdown();
            try
            {
                //
                target.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    
}
