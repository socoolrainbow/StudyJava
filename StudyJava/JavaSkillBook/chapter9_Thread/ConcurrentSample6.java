package chapter9_Thread;

import java.util.ArrayList;

public class ConcurrentSample6 implements Runnable
{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    public static void main(String[] args)
    {
        ConcurrentSample6 example = new ConcurrentSample6();
        
        Thread th1 = new Thread(example);
        Thread th2 = new Thread(example);
        Thread th3 = new Thread(example);
        Thread th4 = new Thread(example);
        Thread th5 = new Thread(example);
        
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
    @Override
    public void run()
    {
        long sTime = System.currentTimeMillis(); /// 1/1000초
        for (int i = 0; i < 10000; i++)
        {
            addList();
        }
        long eTime = System.currentTimeMillis();
        
        System.out.println(Thread.currentThread().getName() + " : " + (eTime - sTime) + "ms");
        
    }
    // 불필요하게 난수발생 부분을 모두 동기화하면 성능하락을 시킨다.
//    private synchronized void addList()
//    {
//        // 
//        int val = (int)(Math.random()*10);
//        if (!list.contains(val))
//        {
//            list.add(val);
//        }
//    }
    
    private void addList()
    {
        int val = (int)(Math.random()*10);
        synchronized (this)
        {
            if (!list.contains(val))
            {
                list.add(val);
            }
        }
    }
}
