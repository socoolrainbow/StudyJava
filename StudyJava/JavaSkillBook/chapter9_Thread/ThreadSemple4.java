package chapter9_Thread;

public class ThreadSemple4
{
    public static void main(String[] args)
    {
        Thread t = new Thread(new MyThread());
        // start() 메소드를 사용하면 메인스레드가 먼저 종료된후에 MyThread가 실행된다.
        
        
        // start() 메소드는 스레드가 세이프하게 스레드들이 동작
//        t.start();
        
        // run() 메소드는 하나의 run()스레드를 끝낸후 다음스레드가 순차적으로 동작한다.
        // 따라서 start()가 thread safe하다?
        t.run();
        System.out.println("MainThread terminated");
    }
}
