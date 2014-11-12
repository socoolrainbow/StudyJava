package chapter3;

public class bitNotOperation
{
    
    public static void main(String[] args)
    {
        int i = 10;
        System.out.println("Variable i (Decimal) : " + i);
        System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
        
        i = ~i;
        System.out.println("Variable i (Decimal) : " + i);
        System.out.println("Variable i (Binary) : " + Integer.toBinaryString(i));
    } 
    
}
