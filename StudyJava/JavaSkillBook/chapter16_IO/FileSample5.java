package chapter16_IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileSample5
{
    public static void main(String[] args)
    {
        FileSample5 example = new FileSample5();
        char seper = File.separatorChar;
        example.printDirectoryInfo("."+seper);
    }

    public void printDirectoryInfo(String path)
    {
        File file = new File(path);
        if (!file.isDirectory()|| !file.exists())
        {
            System.out.println("���丮�� �������� �ʽ��ϴ�.");
            return;
        }
        System.out.println("Path : " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        try
        {
            System.out.println("Canonical Path : " + file.getCanonicalPath());
        }
        catch (IOException e)
        {
            // TODO: handle exception
            e.printStackTrace();
        }
        
        System.out.println("-------------------------------------");
        // file ��ü�� ���ԵǾ��ִ� ���ϵ��� lib�� �����ϴ� ���� fileList �迭�� �ٴٿ´�.
        String[] fileList = file.list();
        for (String fileItem : fileList)
        {
            System.out.println("-" + fileItem);
        }
        
        System.out.println("-------------------------------------");

        // file ��ü�� ���ԵǾ��ִ� ���ϵ��� lib�� �����ϴ� ���� fileList �迭�� �޾ƿ´�.
        fileList = file.list(new FilenameFilter() {
            
            @Override
            public boolean accept(File dir, String name)
            {
                return name.startsWith("lib");
            }
        });
        for (String fileItem : fileList)
        {
            System.out.println(" - " + fileItem);
        }
        
        System.out.println("-------------------------------------");
        
        // prefix�� ',' ���� �����ϴ� ��� ���ϵ��� fileObjList ��ü�� �޾ƿ´�.
        File[] fileObjList = file.listFiles(new FileFilter() {
            
            @Override
            public boolean accept(File pathname)
            {
                
                return pathname.getName().startsWith(".");
            }
        });
        
        for (File fileObj : fileObjList)
        {
            System.out.println(" - " + fileObj.getName());
        }
    }
}
