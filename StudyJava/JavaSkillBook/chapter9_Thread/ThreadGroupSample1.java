package chapter9_Thread;

public class ThreadGroupSample1 implements Runnable
{
    public static void main(String[] args) 
    {
        Thread th = new Thread(new ThreadGroupSample1());
        // ���ν����� �׷��� �켱������ 1�� ����
        // ���ν����� �׷� �ؿ� th Thread�� ���� ������� �巯�� �������� ���� �������� setMaxPrioritiy���� �����صθ�
        // �ƹ��� �ڽ� Thread���� Priority�� �����ص� ���� setMaxPrioritiy �� ������ ���� �����ȴ�.
        Thread.currentThread().getThreadGroup().setMaxPriority(Thread.MIN_PRIORITY);
        
        // th thread�� 10���� ����
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
