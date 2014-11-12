package IO;
import java.io.File;
import java.util.Date;


public class IOExample4
{
    public static void main(String[] args)
    {
        String pathS = File.separator;
        File path = new File("D:" + pathS + "java" + pathS + "git" + pathS
                             + "javaStudy" + pathS + "Study" + pathS + "tmp");
        
        File f = new File(path, "aaa");
//        f.mkdir();
        File ff = new File(path ,"bbb"+File.separator+"ccc"+File.separator+"ddd"+File.separator+"eee");
//        ff.mkdirs();
        
        File f2 = new File(path, "IOExample1.java");
        f2.setLastModified(new Date().getTime());
//        f2.setLastModified(f2.lastModified() - f.lastModified());
        f2.setReadOnly();
        
        f.delete();
        ff.delete();
    }
}
