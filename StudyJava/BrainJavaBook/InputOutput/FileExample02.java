package InputOutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample02
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        try
        {
            // 디렉토리를 기본적으로 처음에 만들고 시작하자... 맞나?
            File tmpdir = new File("C:\\temp");
            tmpdir.mkdir();
            File file = File
                    .createTempFile("tmp", ".txt", new File("C:\\temp"));
            writer = new FileWriter(file);
            writer.write('자');
            writer.write('바');
        }
        catch (IOException ioe)
        {
            System.out.println("임시 파일에 쓸 수 없습니다.");
        }
        finally
        {
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
