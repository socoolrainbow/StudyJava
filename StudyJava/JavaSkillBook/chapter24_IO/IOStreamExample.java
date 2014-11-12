package chapter24_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamExample
{
    public static void main(String[] args) throws IOException
    {
        OutputStream out = new FileOutputStream("data.rhs");
        DataOutputStream filterOut = new DataOutputStream(out);
        filterOut.writeInt(128);
        filterOut.writeDouble(3.14);
        filterOut.close();
        
        InputStream in = new FileInputStream("data.rhs");
        DataInputStream filterIn = new DataInputStream(in);
        int num1 = filterIn.readInt();
        double num2 = filterIn.readDouble();
        filterIn.close();
        
        System.out.println(num1);
        System.out.println(num2);
        
    }
}
