package IO;
import java.io.File;


public class IOExample2
{
    public static void main(String[] args)
    {
        //����� ������
        File f1 = new File("IOExample1.java");
        File f2 = new File("IOExample3.java");
        File f3 = new File("D:\\java\\git\\javaStudy\\Study\\tmp\\IOExample2.java");
//        ���뼺�� ���� �����ڸ� �ҷ��ͼ� ����������!
//        File f3 = new File("D:" + File.separator +"java" + File.separator +"git" + File.separator +"javaStudy" + File.separator +"Study" + File.separator +"tmp" + File.separator + "IOExample2.java");
        File dir = new File("D:\\java\\git\\javaStudy\\Study\\tmp\\");
        File f4 = new File(dir, "IOExample01.java");
    }
}
