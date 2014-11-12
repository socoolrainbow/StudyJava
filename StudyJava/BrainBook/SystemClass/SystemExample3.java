package SystemClass;

public class SystemExample3
{
    public static void main(String[] args)
    {
        /*
         * 표준 출력과 표준 에러 출력을 모두 하는 프로그램
         */
        int arr1[] = { 77, 82, 99, 100, -27, 0, 42, -35, 60, 72 };
        
        int arr2[] = { 7, 0, 3, 0, -1, 2, 11, 5, 0, 9 };
        for (int cnt = 0; cnt < arr1.length; cnt++)
        {
            try
            {
                int result = arr1[cnt]/ arr2[cnt];
                // printf메서드는 API를 보고 공부할것
                // %d는 순서대로 파라미터로 받는 데이터 정수값을 다음과 같은 형식으로 표현하여 출력한다.
                System.out.printf("%d / %d = %d %n", arr1[cnt],arr2[cnt],result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("잘못된 연산입니다. (index = " + cnt + " )");
            }
        }
    }
}
