package chapter16_IO;

import java.io.File;
import java.util.Date;

public class FileSample4
{
    // 해당 path의 파일을 종류를 판단하고 디렉토리면 사이즈와 사용가능 용량을 출력,
    // File이라면 사이즈와 마지막수정한 날자를 표시해주는 예제.
    // printFileStatus()는 파일/디렉토리를 구분해서 출력해주는 메서드
    // fileSizeFilter()는 long타입의 수를 giga/mega/byte/bit로 변환해서 String으로 넘겨준다.
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
                System.out.println(file.getName() + "은(는) Directory이며 Size는 " + fileSizeFilter(file.length()) + "입니다.");
                System.out.println("사용가능한 용량은 : " + fileSizeFilter(file.getFreeSpace())+ "입니다.");
            }
            else if (file.isFile())
            {
                System.out.println(file.getName() + "은(는) File이며 Size는 " + fileSizeFilter(file.length()) + "입니다.");
                System.out.println("파일을 마지막수정한 날짜는 " + new Date(file.lastModified()) + " 입니다.");
            }
            else
            {
                System.out.println("알수없는 형식입니다.");
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        }
        else
        {
            System.out.println("해당 파일이 존재하지 않습니다. " + file.getAbsolutePath() + "를 확인해주세요~!");
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
