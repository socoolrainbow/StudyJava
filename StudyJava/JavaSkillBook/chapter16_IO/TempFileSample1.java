package chapter16_IO;

import java.io.File;
import java.io.IOException;

public class TempFileSample1
{
    public static void main(String[] args)
    {
        // D:\java\git\StudyJava\StudyJava\JavaSkillBook\chapter16_IO\
        // OS���� ��� Seperator �ٸ��Ƿ� FileŬ������ separator�޼��带 ����Ϸ� path�� �����Ͽ� �������!
        TempFileSample1 example = new TempFileSample1();
        char sep = File.separatorChar;
        String path = "D:" + sep + "java" + sep + "git" + sep + "StudyJava" + sep + "StudyJava" + sep + "JavaSkillBook" + sep + "chapter16_IO";
        String logPrifix = "log";
        String tracePrifix = "trace";
        String fileSuffix = ".log";
        
        File traceFile = example.createTempFile(path, tracePrifix, fileSuffix);
        File logFile = example.createTempFile(path, logPrifix, fileSuffix);
        
        if (traceFile.exists() && logFile.exists())
        {
            System.out.println("traceFile name : " + traceFile.getName());
            System.out.println("logFile name : " + logFile.getName());
        }
        else
        {
            System.out.println("traceFile�� logFile�� �������� �ʾҽ��ϴ�.");
        }
        
        logFile.delete();
        traceFile.delete();
        if (!logFile.exists())
        {
            System.out.println("logFile�� ���������� �����Ǿ����ϴ�.");
        }
        
    }
    
    public File createTempFile(String path, String logPrifix, String fileSuffix)
    {
        File dir = new File(path);
        File tmpFile = null;
        if (!dir.exists())
        {
            dir.mkdirs();
        }
        try
        {
            tmpFile = File.createTempFile(logPrifix, fileSuffix, dir);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        return tmpFile;
    }
    
}
