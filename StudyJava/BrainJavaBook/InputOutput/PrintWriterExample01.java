package InputOutput;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

public class PrintWriterExample01
{
    public static void main(String[] args)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter("output.txt");
            writer.println("    ### 성적표  ###    ");
            // %3s 은 3자리의 문자타입을 말하고, %3d 는 3자리의 정수타입, %5.1f 는 실수표현으로 5자리의 정수와
            // 1자리의 소수점자리를 표현하는 포멧팅이다.
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "오승아", 92, 87, 95,
                          91.3f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "임나나", 100, 90, 80,
                          80.9f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "전효성", 95, 45, 100,
                          77.5f);
            writer.printf("%3s : %3d %3d %3d %5.1f %n", "김사랑", 98, 86, 98,
                          88.1f);
            // Calendar타입의 객체가 표현하는 연,월,일을 포팻하는 명세자는 각각 %tY, %tm, %td 이다.
            // $1,$2,$3 포팻팅의경우는 아규먼트 인덱스라(argument index)고 부르는데, 1%는 첫번째 파라미터,
            // 2%는 두번째 파라미터 인덱싱을 말한다.
            // Calentar의경우는 1번째에 다있음으로 %1을 넣어서 포맷팅을 한다 !!
            writer.printf("작성일자 : %1$tY년 %1$tm월 %1$td일",
                          new GregorianCalendar());
            
        }
        catch (IOException ioe)
        {
            System.out.println("파일로 출력할 수 없습니다.");
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (Exception e)
            {
            }
        }
    }
}
