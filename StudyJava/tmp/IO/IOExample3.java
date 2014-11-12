package IO;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class IOExample3
{
    public static void main(String[] args)
    {
        String pathS = File.separator;
        
        // "D:"+pathS+"java"+pathS+"git"+pathS+"javaStudy"+pathS+"Study"+pathS+"tmp"+pathS+"IOExample3.java"
        // D:\java\git\javaStudy\Study\tmp\IOExample3.java
        
        File path = new File("D:" + pathS + "java" + pathS + "git" + pathS
                + "javaStudy" + pathS + "Study" + pathS + "tmp");

        // File f = new
        // File("D:"+pathS+"java"+pathS+"git"+pathS+"javaStudy"+pathS+"Study"+pathS+"tmp"+pathS+"IOExample3.java");
        File f = new File(path, "IOExample3.java");
        System.out.println("read ? " + f.canRead());
        System.out.println("write ? " + f.canWrite());
        
        // ������ �޾ƿ���
        System.out.println("IOExample3.java �����δ�? " + f.getAbsolutePath());
        System.out.println();
        
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.getPath());
//        System.out.println(f.lastModified());
        System.out.println(new Date(f.lastModified()));
        System.out.println(f.length() + "byte");
        System.out.println();
        
        String[] s = path.list();
        for (int i = 0; i < s.length ; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println();
        // ���� ����
        File f1 = new File(path, "test.txt");
        try
        {
            boolean bool = f1.createNewFile();
            System.out.println("test.txt file created? "+ bool);
        }
        catch (IOException e)
        {
            // TODO: handle exception
        }
        
        // tmp���� ���� �� ����
        try
        {
            File f2 = File.createTempFile("temp", ".rhs", path);
            System.out.println("f2 = " + f2);
            // ���α׷� ������ 3���� ����
            f2.deleteOnExit();
        }
        catch (IOException e)
        {
            // TODO: handle exception
        }
        
        // ���ϻ���
        boolean bool = f1.delete();
        System.out.println("text.txt file deleted? " + bool);
        
        
    }
}
