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
            // join메서드는 해당 메서드가 종료될때 까지 대기한다.
            // 따라서 sum()에 먼저 접근한 스레드가 count++ 연산의 10000번을 실행한 후 종료되면 대기 주인 다음 스레드가 sum()에 순차적으로 접근한다.
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

    // 같은 자원을 공유할경우 synchronized 를 선언해서 순차적으로 하나씩 처리하도록 한다.
//    private synchronized void sum()
//    {
//        for (int i = 0; i < 10000; i++)
//        {
//            count++;
//        }
//    } 
    // 같은 표현 같지만 블록단위로 동기화를 하면 더 빠르게 동기화 처리를 할수있다  (성능향상)
    // 코딩시에 꼭필요한 부분만을 동기화 처리해서 성능에 유의하자. 동기화는 성능이 비약적으로 하락시킨다.
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
