package chapter3;

public class StringOperation6
{
    public static void main(String[] args)
    {
        System.out.println("돈과 관련된 유용한 format");
        System.out.println(String.format("%,d",1000000));
        System.out.println(String.format("%,.2f", 1000000f));
        
        System.out.println("\n 문자열 자릿수 맞추는데 유용한 format");
        // 해당 문자열을 10리수로 맟춰 표현
        System.out.println(String.format("%10s", "abcde"));
        System.out.println(String.format("%10s", "abcdefghijklmnopqr"));
        
        System.out.println("\n 부동소수점에 대한 유용한 format");
        // %.?f 는 ? 자리수만큼의 소수점을 갖게 하는 정규식
        System.out.println(String.format("%.2f", 12345.121245));
        System.out.println(String.format("%.2f", 12.1));
    }
}
