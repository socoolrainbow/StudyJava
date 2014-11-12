package chapter6;

public class InnerClassExample2
{
    public static void main(String[] args)
    {
        InnerClassExample2.InnerClass inner = new InnerClassExample2.InnerClass();
        
        System.out.println("keyworld : " + InnerClass.keyword);
        inner.printInfo();
        InnerClass.printName();
    }
    
    static class InnerClass
    {
        static String keyword = "STATIC INNER CLASS";
        public void printInfo()
        {
            System.out.println("You called printInfo method");
        }
        
        public static void printName()
        {
            System.out.println("You called printName method");
        }
    }
}
