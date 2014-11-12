package chapter24_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy
{
    public static void main(String[] args) throws IOException
    {
        int copyByte = 0;
        int bData;
        InputStream in = new FileInputStream("ort.bin");
        OutputStream out = new FileOutputStream("cpy.bin");
        
        while (true)
        {
            bData = in.read();
            if (bData == -1)
            {
                break;
                
//                out.write(bData);
//                copyByte++;
            }
        }
        
        in.close();
        out.close();
        System.out.println("복사된 바이트 크기 " + copyByte);
        
    }
}
