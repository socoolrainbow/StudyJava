package ch12_Thread;

class ThreadEx20
{
    public static void main(String args[])
    {
        ThreadEx20_1 gc = new ThreadEx20_1();
        // 데몬이란 메이스레드가 끝이나면 같이 종료됨
        gc.setDaemon(true);
        gc.start();
        
        int requiredMemory = 0;
        
        while (true)
        {
            requiredMemory = (int) (Math.random() * 10) * 20;
            
            // 필요한 메모리가 사용할 수 있는 양보다 크거나 전체 메모리의 60%이상을
            // 사용했을 경우 gc를 깨운다.
            if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4)
            {
                gc.interrupt(); // 잠자고 있는 쓰레드 t1을 깨운다.
            }
            
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory:" + gc.usedMemory);
            
            if (gc.usedMemory >= gc.MAX_MEMORY)
            {
                System.out.println("메모리 과열 종료합니다...");
                gc.interrupt();
                break;
            }
        }
    }
}

class ThreadEx20_1 extends Thread
{
    final static int MAX_MEMORY = 1000000;
    
    int usedMemory = 0;
    
    public void run()
    {
        while (true)
        {
            try
            {
                Thread.sleep(10 * 1000); // 10초를 기다린다.
            }
            catch (InterruptedException e)
            {
                System.out.println("Awaken by interrupt().");
            }
            
            gc(); // garbage collection을 수행한다.
            System.out.println("Garbage Collected. Free Memory :" + freeMemory());
            
        }
    }
    
    public void gc()
    {
        usedMemory -= 300;
        if (usedMemory < 0) usedMemory = 0;
    }
    
    public int totalMemory()
    {
        return MAX_MEMORY;
    }
    
    public int freeMemory()
    {
        return MAX_MEMORY - usedMemory;
    }
}