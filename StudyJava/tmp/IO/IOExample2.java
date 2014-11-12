package IO;
import java.io.File;


public class IOExample2
{
    public static void main(String[] args)
    {
        //상대경로 절대경로
        File f1 = new File("IOExample1.java");
        File f2 = new File("IOExample3.java");
        File f3 = new File("D:\\java\\git\\javaStudy\\Study\\tmp\\IOExample2.java");
//        범용성을 위해 구분자를 불러와서 쓰도록하자!
//        File f3 = new File("D:" + File.separator +"java" + File.separator +"git" + File.separator +"javaStudy" + File.separator +"Study" + File.separator +"tmp" + File.separator + "IOExample2.java");
        File dir = new File("D:\\java\\git\\javaStudy\\Study\\tmp\\");
        File f4 = new File(dir, "IOExample01.java");
    }
}
