package chapter6;

import java.util.UUID;

public class ServiceGenerator implements GeneratorInterface
{
    public static void main(String[] args)
    {
        ServiceGenerator svcGenerator = new ServiceGenerator();
        String uniqueId = svcGenerator.getUniqueValue();
        System.out.println("Generate unique ID : " + uniqueId);
    }
    @Override
    public String getUniqueValue()
    {
        // UUID클래스는 Universal Unique ID의 줄임말로 중복될 확률이 극히 낮은 키값을 생성한다.
        String rt = ServiceGenerator.ID_HEADER + UUID.randomUUID();
        return rt;
    }
}
