package InputOutput;
import java.io.FileWriter;
import java.io.IOException;


public class WriterExample01
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        try
        {
            writer = new FileWriter("output.txt",true);
            char arr[] = {'노','현','수','만','세','!','!'};
            for (int cnt = 0; cnt < arr.length; cnt++)
            {
                writer.write(arr[cnt]);
            }
        }
        catch (IOException ioe)
        {
            // TODO: handle exception
            System.out.println("파일로 출력할 수 없습니다.");
        }
        finally{
            try
            {
                writer.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
    }
    
}
