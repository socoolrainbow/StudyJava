package chapter3;

public class UnaryOperator
{
    
    public static void main(String[] args)
    {
        int vluAfter = 0;
        long vluBefore = 0;
        char chrAfter = 'A';
        
        System.out.println("First reference : " + vluAfter++);
        System.out.println("First reference : " + --vluBefore);
        System.out.println("First reference : " + chrAfter++);
        
        System.out.println("second reference : " + vluAfter); 
        System.out.println("second reference : " + vluBefore);
        System.out.println("second reference : " + chrAfter); 
    }
    
}
