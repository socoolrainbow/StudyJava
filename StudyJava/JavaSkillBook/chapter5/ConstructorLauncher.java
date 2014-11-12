package chapter5;

public class ConstructorLauncher
{
    public static void main(String[] args)
    {
        ConstructorExample example1 = new ConstructorExample();
        ConstructorExample example2 = new ConstructorExample("Second");
        
        System.out.println(System.identityHashCode(example1));
        System.out.println(System.identityHashCode(example2));
    }
}
