package InputOutput;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;

public class ObjectInputExample01
{
    public static void main(String[] args)
    {
        ObjectInputStream in = null;
        try
        {
            in = new ObjectInputStream(new FileInputStream("output.dat"));
            while (true)
            {
                GregorianCalendar calendar = (GregorianCalendar) in
                        .readObject();
                int year = calendar.get(calendar.YEAR);
                // 달은 0부터 1월로 표현함으로 +1을 연산해준다.
                int month = calendar.get(calendar.MONTH) + 1;
                int date = calendar.get(calendar.DATE);
                // 파일로부터 GregorianCalendar 객체를 읽어서 YYYY/MM/DD 포맷으로 출력한다.
                System.out.println(year + "/" + month + "/" + date);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch (EOFException eofe)
        {
            // 파일로부터 더 이상 읽을 객체가 없을 때 발생하는 익셉션을 처리.
            System.out.println("끝");
        }
        catch (IOException ioe)
        {
            System.out.println("파일을 읽을수 없습니다.");
        }
        catch (ClassNotFoundException cnfe)
        {
            System.out.println("해당 클래스가 존재하지 않습니다.");
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
