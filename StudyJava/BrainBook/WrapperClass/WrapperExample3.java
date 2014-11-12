package WrapperClass;

public class WrapperExample3
{
    public static void main(String[] args)
    {
        int total = 0;
        for (int cnt = 0; cnt < args.length; cnt++)
        {
            // Parse메소드들은 래퍼 객체를 생성하지 않고 문자열을 해석하기 때문에, Example2에서 사용한 문자열 파라미터를 받는 생성자보다 효율적이다.
            total += Integer.parseInt(args[cnt]);
        }
        System.out.println(total);
    }
}
