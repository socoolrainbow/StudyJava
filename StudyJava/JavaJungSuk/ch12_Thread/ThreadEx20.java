package ch12_Thread;

class ThreadEx20
{
    public static void main(String args[])
    {
        ThreadEx20_1 gc = new ThreadEx20_1();
        // �����̶� ���̽����尡 ���̳��� ���� �����
        gc.setDaemon(true);
        gc.start();
        
        int requiredMemory = 0;
        
        while (true)
        {
            requiredMemory = (int) (Math.random() * 10) * 20;
            
            // �ʿ��� �޸𸮰� ����� �� �ִ� �纸�� ũ�ų� ��ü �޸��� 60%�̻���
            // ������� ��� gc�� �����.
            if (gc.freeMemory() < requiredMemory || gc.freeMemory() < gc.totalMemory() * 0.4)
            {
                gc.interrupt(); // ���ڰ� �ִ� ������ t1�� �����.
            }
            
            gc.usedMemory += requiredMemory;
            System.out.println("usedMemory:" + gc.usedMemory);
            
            if (gc.usedMemory >= gc.MAX_MEMORY)
            {
                System.out.println("�޸� ���� �����մϴ�...");
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
                Thread.sleep(10 * 1000); // 10�ʸ� ��ٸ���.
            }
            catch (InterruptedException e)
            {
                System.out.println("Awaken by interrupt().");
            }
            
            gc(); // garbage collection�� �����Ѵ�.
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