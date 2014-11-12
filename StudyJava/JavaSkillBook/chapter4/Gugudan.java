package chapter4;

public class Gugudan
{
    
    public static void main(String[] args)
    {
        if (args == null || args.length != 1)
        {
            System.out.println("Usage: java Gugudan [number]");
            return;
        }
        
        int dan = Integer.parseInt(args[0]);
        for (int i = 1; i < 10; i++)
        {
            System.out.println(dan + " * " + i + " = " +  dan*i);
        }
    }
    
}
