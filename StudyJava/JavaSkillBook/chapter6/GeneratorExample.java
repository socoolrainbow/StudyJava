package chapter6;

public class GeneratorExample
{
    public static void main(String[] args)
    {
        /*
         * GeneratorInterface클래스를 사용해서 인터페이스로 관계를 맺은 클래스들이 인터페이스라는 공통점으로 업캐스팅이 가능하다는 것을 보여준다.
         */
        ServiceGenerator svc = new ServiceGenerator();
        SystemGenerator sys = new SystemGenerator();
        
        String svcName = svc.getClass().getSimpleName();
        if (svc instanceof GeneratorInterface)
        {
            System.out
                    .println(svcName + " is a instance of GeneratorInterface");
        }
        else
        {
            System.out.println(svcName
                    + " is not a instance of generatorInterface");
        }
        
        if (svc instanceof ServiceGenerator)
        {
            System.out.println(svcName + " is a instance of ServiceGenerator");
        }
        else
        {
            System.out.println(svcName
                    + " is not a instance of ServiceGenerator");
        }
        
        String sysName = sys.getClass().getSimpleName();
        if (sys instanceof GeneratorInterface)
        {
            System.out
                    .println(sysName + " is a instance of GeneratorInterface");
        }
        else
        {
            System.out.println(sysName
                    + " is not a instance of generatorInterface");
        }
        
        if (sys instanceof SystemGenerator)
        {
            System.out.println(sysName + " is a instance of SystemGenerator");
        }
        else
        {
            System.out.println(sysName
                    + " is not a instance of SystemGenerator");
        }
        
        GeneratorInterface genIf1 = (GeneratorInterface)sys;
        GeneratorInterface genIf2 = (GeneratorInterface)svc;
    }
}
