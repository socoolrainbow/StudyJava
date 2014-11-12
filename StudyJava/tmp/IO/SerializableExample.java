package IO;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample implements Serializable
{
    int xPos;
    
    int yPos;
    
    double rad;
    
    public SerializableExample(int x, int y, double r)
    {
        xPos = x;
        yPos = y;
        rad = r;
    }
    
    public void showCirlceInfo()
    {
        System.out.printf("[%d, %d] \n", xPos, yPos);
        System.out.println("rad : " + rad);
    }
    
    public static void main(String[] args) throws IOException,
            ClassNotFoundException
    {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                "Object.ser"));
        out.writeObject(new SerializableExample(1, 1, 2.4));
        out.writeObject(new SerializableExample(2, 2, 4.8));
        out.writeObject(new String("String implements Serializable"));
        out.close();
        
        // 인스턴스 복원
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "Object.ser"));
        SerializableExample s1 = (SerializableExample) in.readObject();
        SerializableExample s2 = (SerializableExample) in.readObject();
        String message = (String) in.readObject();
        in.close();
        
        // 복원 정보출력
        s1.showCirlceInfo();
        s2.showCirlceInfo();
        System.out.println(message);
    }
}
