package chapter9_Thread;

public class ThreadGroupSample1 implements Runnable
{
    public static void main(String[] args) 
    {
        Thread th = new Thread(new ThreadGroupSample1());
        // 메인스레드 그룹의 우선순위를 1로 설정
        // 메인스레드 그룹 밑에 th Thread가 하위 스레드로 드러가 있음으로 사위 스레드의 setMaxPrioritiy값을 설정해두면
        // 아무리 자식 Thread에서 Priority를 변경해도 상위 setMaxPrioritiy 값 이하의 값만 설정된다.
        Thread.currentThread().getThreadGroup().setMaxPriority(Thread.MIN_PRIORITY);
        
        // th thread를 10으로 설정
        th.setPriority(Thread.MAX_PRIORITY);
        th.start();
    }
    @Override
    public void run()
    {
        // TODO Auto-generated method stub
        System.out.println("Priority : " + Thread.currentThread().getPriority());
    }
}
