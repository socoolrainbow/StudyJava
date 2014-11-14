package chapter16_IO;

import java.io.File;
import java.io.IOException;

public class FIleSample1
{
    public static void main(String[] args)
    {
        FIleSample1 example = new FIleSample1();
        char sep = File.separatorChar;
        //D:\java\git\StudyJava\StudyJava\JavaSkillBook\chapter16_IO\
        // OS���� ��� Seperator �ٸ��Ƿ� FileŬ������ separator�޼��带 ����Ϸ� path�� �����Ͽ� �������!
        String url = "D:"+sep+"java"+sep+"git"+sep+"StudyJava"+sep+"StudyJava"+sep+"JavaSkillBook";
        String fileName = "test.txt";
        String confName = "test.conf";
        
        File f1 = example.createFile(url,fileName);
        File f2 = example.createFile(url,confName);
        
        System.out.println("Exist File? : " + f1.exists());
        System.out.println("Exist confFile? : " + f2.exists());
        
        f2.delete();
        System.out.println("Exist confFile? : " + f2.exists());
    }

    public File createFile(String url, String fileName)
    {
        File path = new File(url);
        File file = new File(url, fileName);
        
        if (file.exists())
        {
            return file;
        }
        
        path.mkdirs();
        
        try
        {
            file.createNewFile();
        }
        catch (IOException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        return file;
    }
    
    
    
}
