package IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectInputOUtputExam1
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Emp roh = new Emp(1, "노현수", "이사장", 3001, 5.0);
        Emp roh2 = new Emp(1, "이순신", "부장", 3002, 4.4);
        Emp roh3 = new Emp(1, "장영실", "대리", 3003, 2.4);
        
        // true로 지정하면 계속 기존 파일에 appen된다.
        FileOutputStream fos = new FileOutputStream("object.txt",true);
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(roh);
        oos.writeObject(roh2);
        oos.writeObject(roh3);
        
        oos.close();
        fos.close();
        
        //파일에서 객체를 읽어와 화면에 출력
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
        
        roh = (Emp)ois.readObject();
        roh2 = (Emp)ois.readObject();
        roh3 = (Emp)ois.readObject();
        
        System.out.println("사번\t이름\t직책\t부서\t보너스");
        System.out.println("==========================================");
        System.out.println(roh);
        System.out.println(roh2);
        System.out.println(roh3);
        
        System.out.println();
    }
}
