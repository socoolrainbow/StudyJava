package chapter16_IO;

import java.io.File;
import java.io.IOException;

public class FileSample3
{
    public static void main(String[] args)
    {
        FileSample3 example = new FileSample3();
        char sep = File.separatorChar;
        String path = "D:" + sep + "java" + sep + "git" + sep + "StudyJava" + sep + "StudyJava" + sep + "JavaSkillBook" + sep + "chapter16_IO";
        String fileName = "test.txt";
        example.testPermission(path, fileName);
        
    }

    public void testPermission(String path, String fileName)
    {
        // TODO Auto-generated method stub
        File file = new File(path,fileName);
        try
        {
            if (!file.createNewFile())
            {
                System.out.println("No file at " + path);
                return;
                
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        file.setReadOnly();
        System.out.println("Permission to execute : " + file.canExecute());
        System.out.println("Permission to read : " + file.canRead());
        System.out.println("Permission to write : " + file.canWrite());
    }
}
