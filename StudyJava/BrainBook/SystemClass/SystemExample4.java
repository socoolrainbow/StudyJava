package SystemClass;

public class SystemExample4
{
    public static void main(String[] args)
    {
        // path의 환경변수를 읽어오는 프로그램
        String str = System.getenv("path");
        System.out.println(str);
    }
}
