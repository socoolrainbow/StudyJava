package InputOutput;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;


public class ObjectOutputExample01
{
    public static void main(String[] args)
    {
        ObjectOutputStream out = null;
        try
        {
            out = new ObjectOutputStream(new FileOutputStream("output.dat"));
            out.writeObject(new GregorianCalendar(2014, 6, 14));
            out.writeObject(new GregorianCalendar(2014, 6, 15));
            out.writeObject(new GregorianCalendar(2014, 6, 16));
        }
        
        catch (IOException ioe)
        {
            System.out.println("파일로 출력할 수 없습니다."); 
        }
        finally
        {
            System.out.println("끝");
        }
    }
}
