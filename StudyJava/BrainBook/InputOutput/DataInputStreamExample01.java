package InputOutput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamExample01
{
    public static void main(String[] args)
    {
        DataInputStream in = null;
        try
        {
            in = new DataInputStream(new FileInputStream("output.dat"));
            // 파일을 연다.
            while (true)
            {
                int data = in.readInt();
                System.out.println(data);
                // 파일로부터 정수를 읽어서 출력한다.
                if (data == -1)
                {
                    break;
                }
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (EOFException eofe)
        {
            System.out.println("끝");
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을수 없습니다.");
        }
        finally
        {
            try
            {
                in.close();
            }
            catch (Exception e)
            {
                // TODO: handle exception
            }
        }
        
    }
}
