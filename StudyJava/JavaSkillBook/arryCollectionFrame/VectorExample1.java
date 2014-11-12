package arryCollectionFrame;

import java.util.Vector;

public class VectorExample1
{
    private int count = 0;
    private Vector<String> vector = new Vector<String>(10,5);
    public static void main(String[] args)
    {
        VectorExample1 example = new VectorExample1();
        example.execute();
    }
    public void execute()
    {
        // 첫번째 호출
        this.printStatus();
        for (int i = 0; i < 4; i++)
        {
            vector.addElement(String.valueOf(i));
        }
        // 두번째 호출
        this.printStatus();
        for (int i = 0; i < 4; i++)
        {
            vector.add(String.valueOf(i));
        }
        // 세번째 호출
        this.printStatus();
        // 클래스의 용량을 맴버요소의 개수만큼으로 변경
        vector.trimToSize();
        // 네번째 호출
        this.printStatus();
        vector.setSize(20);
        
        this.printStatus();
        
        System.out.println(vector.toString());
    }
    public void printStatus()
    {
        count++;
        System.out.println("[" + count + "] Capacity : " + vector.capacity() + "Elememt size : " + vector.size());
    }
    
}
