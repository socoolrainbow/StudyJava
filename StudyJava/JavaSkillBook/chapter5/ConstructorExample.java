package chapter5;

public class ConstructorExample
{
    public ConstructorExample()
    {
        System.out.println("First constructor is called");
    }
    
    public ConstructorExample(String str)
    {
        System.out.println("Second constructor is called with parameter : " + str);
    }
}
