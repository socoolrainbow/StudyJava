package chapter9_Thread;

public class ConcurrentSample2 implements Runnable
{
    private int count = 0;
    public static void main(String[] args)
    {
        ConcurrentSample2 concurrent = new ConcurrentSample2();
        Thread th1 = new Thread(concurrent);
        Thread th2 = new Thread(concurrent);
        
        th1.start();
        th2.start();
        
        try
        {
            // join�޼���� �ش� �޼��尡 ����ɶ� ���� ����Ѵ�.
            // ���� sum()�� ���� ������ �����尡 count++ ������ 10000���� ������ �� ����Ǹ� ��� ���� ���� �����尡 sum()�� ���������� �����Ѵ�.
            th1.join();
            th2.join();
        }
        catch (InterruptedException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        System.out.println(concurrent.count);
       
    }
    
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        sum();
    }

    // ���� �ڿ��� �����Ұ�� synchronized �� �����ؼ� ���������� �ϳ��� ó���ϵ��� �Ѵ�.
//    private synchronized void sum()
//    {
//        for (int i = 0; i < 10000; i++)
//        {
//            count++;
//        }
//    } 
    // ���� ǥ�� ������ ��ϴ����� ����ȭ�� �ϸ� �� ������ ����ȭ ó���� �Ҽ��ִ�  (�������)
    // �ڵ��ÿ� ���ʿ��� �κи��� ����ȭ ó���ؼ� ���ɿ� ��������. ����ȭ�� ������ ��������� �϶���Ų��.
    private void sum()
    {
        //
        synchronized (this)
        {
            for (int i = 0; i < 10000; i++)
            {
                count++;
            }
        }
    } 
    
}
