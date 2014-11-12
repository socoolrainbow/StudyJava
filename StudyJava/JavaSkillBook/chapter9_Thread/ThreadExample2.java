package chapter9_Thread;
public class ThreadExample2 extends Thread
{
    public static void main(String[] args)
    {
        ThreadExample2 example = new ThreadExample2();
        example.run();
    }
    
    @Override
    public void run()
    {
        System.out.println("New flow, new thread isrunning");
    }
}
