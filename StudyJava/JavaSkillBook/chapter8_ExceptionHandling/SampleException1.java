package chapter8_ExceptionHandling;

// args[]에 값이 문자일경우에 exception이 발생한다.
public class SampleException1
{
    public static void main(String[] args)
    {
        if (args == null || args.length ==0)
        {
            System.out.println("Usage : java sampleException [Number]");
            return;
        }
        
        SampleException1 tester = new SampleException1();
        
        String rt = tester.parseBianry(args[0]);
        
        System.out.println("Decimal Number : " + args[0] );
        System.out.println("Binary Number : " + rt);
    }

    public String parseBianry(String str)
    {
        int decimal = Integer.parseInt(str);
        String binary = Integer.toBinaryString(decimal);
        return binary;
    }
}
