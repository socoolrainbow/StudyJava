package SystemClass;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample1
{
    public static void main(String[] args)
    {
        // System클래스의 in필드를 가지고 InputStreamReader 객체를 생성
        InputStreamReader reader = new InputStreamReader(System.in);
        try
        {
            while (true)
            {
                char ch = (char)reader.read();
                System.out.println("입력된 문자 :" + ch);
                // 키보드로 한글자씩 입력 받아서 출력하는 일응 마침표가 입력될때까지 반복한다.
                if (ch=='.')
                {
                    break;
                }
            }
        }
        catch (IOException ioe)
        {
            System.out.println("키보드입력 에러!!");
        }
    }
}
