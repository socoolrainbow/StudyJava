package SystemClass;

public class SystemExample7
{
    public static void main(String[] args)
    {
        /*
         * exit메소드의 사용 예를 보여주는 프로그램
         * 
         * exit메소드에는 int타입의 파라미터를 넘겨주어야 한다.
         * 이 파라미터 값은 보통은 사용되지 않지만 다른 프로그램에 의해 자바 프로그램이 호출 되었을 경우에 그프로그램에 의해 사용될수도 있다.
         * 관례에 따르면 이 파라미터 값이 0일 때는 프로그램이 정상 종료하엿음을 표사하고, 0이 아닌 값일 때는 할 일을 못 마치고 비정상 종료하였음을 표시한다.
         */
        
        if (args.length !=2)
        {
            System.out.println("Usage: java SystemExample7 <정수> <정수>");
            System.exit(1);
        }
        try
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("sum = " + sum);
            System.exit(0);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("잘못된 숫자 입니다.");
            System.exit(-1);
        }
    }
}
