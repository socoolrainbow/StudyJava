package chapter4;

public class RuntimeErrorSample3
{
    
    public static void main(String[] args)
    {
        String nullStr = null;
        if ("test".equals(nullStr))
        {
            System.out.println("Find out where it is");
        }
        // null값이나 문자를 처리하고 싶지 않다면 다음과 같은 로직의 if문을 사용해서 처리할수도 있다.
        //if (paramStr != null && !"".equals(paramStr))
        
    }
    
}
