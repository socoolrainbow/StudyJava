package chapter6;

public class SystemGenerator implements GeneratorInterface
{

    public static void main(String[] args)
    {
        SystemGenerator sysGenerator = new SystemGenerator();
        String uniqueId = sysGenerator.getUniqueValue();
        System.out.println("Generate unique ID : " + uniqueId);
    }
    @Override
    public String getUniqueValue()
    {
        // System.nanoTime()메소드는 System.currentTimeMillis()메소드와 다르게 나노 초까지 반환하므로 중복된 값이 나올 가능성이 적다.
        String rt = SystemGenerator.ID_HEADER + System.nanoTime() + SystemGenerator.DELIMITER + System.identityHashCode(this);
        return rt;
    }
    
}
