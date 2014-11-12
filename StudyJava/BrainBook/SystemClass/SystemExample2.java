package SystemClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample2
{
    public static void main(String[] args)
    {
        /*
         * InputStreamReader클래스와 더불어 BufferedReader클래스를 함께사용하여
         * 키보드로 입력받은 데이터를 한줄 단위로 읽어서 처리할수 있다.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String str = reader.readLine();
            System.out.println("입력된 문자열: " + str);
        }
        catch (IOException ioe)
        {
            System.out.println("키보드 입력 에러~!");
        }
    }
}
