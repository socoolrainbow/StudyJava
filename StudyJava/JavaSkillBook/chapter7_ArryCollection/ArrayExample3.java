package chapter7_ArryCollection;

import java.util.Date;

public class ArrayExample3
{
    private Object[] arr = new Object[6];
    
    public static void main(String[] args)
    {
        ArrayExample3 example = new ArrayExample3();
        example.init();
        example.printMember();
    }
    
    public void init()
    {
        // TODO Auto-generated method stub
        arr[0] = new String("My name is Hyunsoo Roh");
        arr[1] = 32L;
        arr[2] = 12;
        arr[3] = 1102.4F;
        arr[4] = 3.141234123412378D;
        arr[5] = new Date();
        
    }
    
    public void printMember()
    {
        // TODO Auto-generated method stub
        if (arr == null || arr.length == 0)
        {
            System.out.println("Empty array");
            return;
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            Object obj = arr[i];
            
            if (obj instanceof String)
            {
                System.out.println("String Type : " + (String) obj);
            }
            else if (obj instanceof Long)
            {
                System.out.println("Long Type : " + (Long) obj);
                
            }
            else if (obj instanceof Integer)
            {
                System.out.println("Integer Type : " + (Integer) obj);
                
            }
            else if (obj instanceof Double)
            {
                System.out.println("Double Type : " + (Double) obj);
                
            }
            else if (obj instanceof Float)
            {
                System.out.println("Float Type : " + (Float) obj);
                
            }
            else if (obj instanceof Date)
            {
                System.out.println("Date Type : " + (Date) obj);
                
            }
        }
    }
}
