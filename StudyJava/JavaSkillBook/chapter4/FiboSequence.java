package chapter4;

public class FiboSequence
{
    
    public static void main(String[] args)
    {
        int first = 1;
        int second = 0;
        int third = 0;
        
        int count = 0;
        while (count ++ <30)
        {
            System.out.print(first + "\t");
            third = second;
            second = first;
            first = second + third;
        }
    }
    
}
