package chapter9_Thread;

public class ThreadSemple4
{
    public static void main(String[] args)
    {
        Thread t = new Thread(new MyThread());
        // start() �޼ҵ带 ����ϸ� ���ν����尡 ���� ������Ŀ� MyThread�� ����ȴ�.
        
        
        // start() �޼ҵ�� �����尡 �������ϰ� ��������� ����
//        t.start();
        
        // run() �޼ҵ�� �ϳ��� run()�����带 ������ ���������尡 ���������� �����Ѵ�.
        // ���� start()�� thread safe�ϴ�?
        t.run();
        System.out.println("MainThread terminated");
    }
}
