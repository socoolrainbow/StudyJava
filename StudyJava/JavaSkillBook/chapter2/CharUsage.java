package chapter2;

public class CharUsage
{
    
    public static void main(String[] args)
    {
        char tab = '\t';
        // line feed 개행문자
        char linefeed = '\n';
        // carrage return 복귀문자
        char cRetrun = '\r';
        // 쌍따옴표
        char dQuote = '\"';
        // 홑따옴표
        char sQuote = '\'';
        // 역슬레시
        char bSlash = '\\';
        
        System.out.println("1> ABCD" + tab + "EFG");
        System.out.println("2> ABCD" + linefeed + "EFG");
        System.out.println("3> ABCD" + cRetrun + "EFG");
        System.out.println("4> ABCD" + dQuote + "EFG");
        System.out.println("5> ABCD" + sQuote + "EFG");
        System.out.println("6> ABCD" + bSlash + "EFG");
        
        /*
         * 라인피드는 LF라고 표기하며 커서를 다음 행으로 옮기는 기능을 한다. 캐리지 리턴은 CR이라고 표기하며 행의 가장 왼쪽에
         * 위치시키는 역할을 한다. 보통 프로그래밍에서 LF와 CR은 다음 행(라인)으로 이동시키는데 사용하고 있으며 이 둘을 개행
         * 문자라고 한다. 윈도우에서는 개행 문자를 '\r\n'으로 사용하고 UNIX에서는 '\n'만 사용한다.
         */
    }
    
}
