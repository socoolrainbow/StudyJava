package chapter6;

public class IntegerHangler extends AbstractHandler
{
    public static void main(String[] args)
    {
        IntegerHangler integerHangler = new IntegerHangler();
        System.out.println(integerHangler.getRangeInfo());
    }
    
    @Override
    public String getRangeInfo()
    {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String rt = "From : "+ max + ", To : " + min;
        return rt;
    }
}
