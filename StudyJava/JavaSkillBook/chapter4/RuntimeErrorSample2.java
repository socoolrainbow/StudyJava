package chapter4;

public class RuntimeErrorSample2
{
    public static void main(String[] args)
    {
        // 매개변수 없이 클래스가 실행되면 다음의 비교문에서 NullPointerException이 발생한다.
        // 이런 에러를 막기위해 RuntimeErrorSample3처럼 코딩하자~!
        String nullStr = null;
        if (nullStr.equals("test"))
        {
            System.out.println("Find out where it is");
        }
    }
}
