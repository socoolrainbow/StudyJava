package chapter6;

public class LongHandler extends AbstractHandler
{
    
    public static void main(String[] args)
    {
        LongHandler longHandler = new LongHandler();
        System.out.println(longHandler.getRangeInfo());
    }
    
    // 상속받은 추상메서드를 완성한다.
    @Override
    public String getRangeInfo()
    {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        String rt = "From : " + max + ", To : " + min;
        return rt;
    }
}
