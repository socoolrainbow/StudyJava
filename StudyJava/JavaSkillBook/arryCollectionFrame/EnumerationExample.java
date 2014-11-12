package arryCollectionFrame;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationExample
{
    private final int LENGTH = 10;
    private Vector<Integer> vector = new Vector<Integer>();
    private Hashtable<Integer, String> table = new Hashtable<Integer, String>();
    
    public static void main(String[] args)
    {
        EnumerationExample example = new EnumerationExample();
        example.init();
        example.execute();
    }

    public void init()
    {
        for (int i = 0; i < this.LENGTH; i++)
        {
            vector.addElement(i);
            table.put(i, "Str" + i);
        }
    }

    public void execute()
    {
        Enumeration<Integer> eInt = vector.elements();
        while (eInt.hasMoreElements())
        {
            System.out.print("[" + eInt.nextElement() + "] ");
        }
        System.out.println();
        
        Enumeration<String> eStr = table.elements();
        while (eStr.hasMoreElements())
        {
            System.out.print("[" + eStr.nextElement() + "] ");
        }
        System.out.println();
    }
    
}
