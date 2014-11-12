package chapter9_Thread;

public class ThreadSample7
{
    public static void main(String[] args)
    {
        // main스레드 그룹의 이름을 얻어올수있다.
        String thisThName = Thread.currentThread().getName();
        System.out.println("Thread name : " + thisThName);
        
        String thisThGrpName = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Thread name : " + thisThGrpName);
    }
}
