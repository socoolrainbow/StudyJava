package chapter8_ExceptionHandling;

public class SampleException2
{
    public static void main(String[] args)
    {
        if (args == null || args.length == 0)
        {
            System.out.println("Usage : java SampleException [Number]");
            return;
        }
        
        SampleException2 tester = new SampleException2();
        
        String rt = tester.parseBinary(args[0]);
        System.out.println("Decimal Number : " + args[0]);
        System.out.println("Binary Number : " + rt);
        
    }

    public String parseBinary(String str)
    {
        String binary = null;
        try
        {
            int decimal = Integer.parseInt(str);
            binary = Integer.toBinaryString(decimal);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Wrong number format string.");
            e.printStackTrace();
        }
        return binary;
    }
}
