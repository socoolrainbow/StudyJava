package chapter16_IO;

import java.io.File;

public class FileVariable1
{
    public static void main(String[] args)
    {
        System.out.println("Path Seperator String : " + File.pathSeparator);
        System.out.println("Path Seperator Char : " + File.pathSeparatorChar);
        System.out.println("seperater Seperator: " + File.separator);
        System.out.println("seperater Seperator: " + File.separatorChar);
    }
}
