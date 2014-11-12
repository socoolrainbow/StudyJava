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
        Emp roh = new Emp(1, "������", "�̻���", 3001, 5.0);
        Emp roh2 = new Emp(1, "�̼���", "����", 3002, 4.4);
        Emp roh3 = new Emp(1, "�念��", "�븮", 3003, 2.4);
        
        // true�� �����ϸ� ��� ���� ���Ͽ� appen�ȴ�.
        FileOutputStream fos = new FileOutputStream("object.txt",true);
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(roh);
        oos.writeObject(roh2);
        oos.writeObject(roh3);
        
        oos.close();
        fos.close();
        
        //���Ͽ��� ��ü�� �о�� ȭ�鿡 ���
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
        
        roh = (Emp)ois.readObject();
        roh2 = (Emp)ois.readObject();
        roh3 = (Emp)ois.readObject();
        
        System.out.println("���\t�̸�\t��å\t�μ�\t���ʽ�");
        System.out.println("==========================================");
        System.out.println(roh);
        System.out.println(roh2);
        System.out.println(roh3);
        
        System.out.println();
    }
}
