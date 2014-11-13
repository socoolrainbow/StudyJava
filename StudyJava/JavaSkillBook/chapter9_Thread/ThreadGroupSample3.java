package chapter9_Thread;

public class ThreadGroupSample3 implements Runnable
{
    public static void main(String[] args)
    {
        new Thread(new ThreadGroupSample3(), "ThreadGroupSample3").start();
        
        // 스레드그룹을 생성하고, 스레드그룹에서 현재 실행중인 스레드개수만큼의 배열공간을 가진 스레드배열을 생성 
        ThreadGroup thGroup = Thread.currentThread().getThreadGroup();
        Thread[] thArr = new Thread[thGroup.activeCount()];
        
        // 생성한 배열 객체를 enumerate() 메소드의 매개변수로 넣으면 메소드 내부에서 배열 객체의 멤버 객체를 넣어준다.
        thGroup.enumerate(thArr);
        
        for (Thread th : thArr)
        {
            System.out.println(th.getName());
        }
        
    }
    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
//            break;
        }
    }
}
