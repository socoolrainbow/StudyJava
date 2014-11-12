// 콘솔에서 실행할경우는 package를 입력할경우 경로가 제대로 잡히지않아 클래스를 찾을수없다고 할수있음으로 package 부분을 주석처리하고 실행하자
package chapter9_Thread;

public class TerminateSample1 implements Runnable
{
    public static void main(String[] args)
    {
        Thread test = new Thread(new TerminateSample1(),"TEST");
        test.start();
        
        System.out.println("Press Ctrl+C to Exit.");
    }
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Test is Running...");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                break;
            }
            System.out.println("End of procedure");
        }
    }
}
