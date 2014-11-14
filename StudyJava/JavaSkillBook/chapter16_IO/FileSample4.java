package chapter16_IO;

import java.io.File;
import java.util.Date;

public class FileSample4
{
    // �ش� path�� ������ ������ �Ǵ��ϰ� ���丮�� ������� ��밡�� �뷮�� ���,
    // File�̶�� ������� ������������ ���ڸ� ǥ�����ִ� ����.
    // printFileStatus()�� ����/���丮�� �����ؼ� ������ִ� �޼���
    // fileSizeFilter()�� longŸ���� ���� giga/mega/byte/bit�� ��ȯ�ؼ� String���� �Ѱ��ش�.
    private static int bytePer = 1024;
    
    private static int megaPer = 1024 * 1024;
    
    private static int gigaPer = 1024 * 1024 * 1024;
    
    public static void main(String[] args)
    {
        FileSample4 example = new FileSample4();
        
        char sep = File.separatorChar;
        String path1 = "D:" + sep + "java" + sep + "git" + sep + "StudyJava" + sep + "StudyJava" + sep + "JavaSkillBook" + sep + "chapter16_IO";
        String path2 = "D:" + sep + "java" + sep + "git" + sep + "StudyJava" + sep + "StudyJava" + sep + "JavaSkillBook" + sep + "chapter16_IO"+ sep + "FileSample4.java";
        
        example.printFileStatus(path1);
        example.printFileStatus(path2);
    }
    
    public void printFileStatus(String path)
    {
        File file = new File(path);
        if (file.exists())
        {
            if (file.isDirectory())
            {
                System.out.println(file.getName() + "��(��) Directory�̸� Size�� " + fileSizeFilter(file.length()) + "�Դϴ�.");
                System.out.println("��밡���� �뷮�� : " + fileSizeFilter(file.getFreeSpace())+ "�Դϴ�.");
            }
            else if (file.isFile())
            {
                System.out.println(file.getName() + "��(��) File�̸� Size�� " + fileSizeFilter(file.length()) + "�Դϴ�.");
                System.out.println("������ ������������ ��¥�� " + new Date(file.lastModified()) + " �Դϴ�.");
            }
            else
            {
                System.out.println("�˼����� �����Դϴ�.");
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("�ش� ������ �������� �ʽ��ϴ�. " + file.getAbsolutePath() + "�� Ȯ�����ּ���~!");
        }
    }
    
    public static StringBuffer fileSizeFilter(long size)
    {
        StringBuffer sort = new StringBuffer();
        if (size >= gigaPer)
        {
            sort.append(size / gigaPer).append("GigaByte ");
        }
        else if (size >= megaPer && size < gigaPer)
        {
            sort.append(size / megaPer).append("MegaByte ");
        }
        else if (size >= bytePer && size < megaPer)
        {
            sort.append(size / bytePer).append("Byte ");
        }
        else
        {
            sort.append(size).append("bit ");
        }
        return sort;
        
    }
    
}
