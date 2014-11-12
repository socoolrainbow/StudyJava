package InputOutput;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class LineNumberExample01
{
    public static void main(String[] args)
    {
        LineNumberReader reader = null;
        try
        {
            reader = new LineNumberReader(new FileReader("poem.txt"));
            System.out.println("####### # # 파일출력 시작 # # #######");
            while (true)
            {
                String str = reader.readLine();
                if (str == null)
                {
                    System.out.println("####### # # 파일출력 끝 # # #######");
                    break;
                }
                int lineNo = reader.getLineNumber();
                System.out.println(lineNo + ": " + str);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을 수 없습니다.");
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
}
