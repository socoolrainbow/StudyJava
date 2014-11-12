package chapter6;

public class InnerClassExample4
{
    public static void main(String[] args)
    {
        InnerClassExample4 exam = new InnerClassExample4();
        System.out.println(exam.getName().toString());
        
    }
    
    public Object getName()
    {
        return new Object() {
            public String toString()
            {
                return this.getClass().getName();
            }
        };
    }
}
