package chapter4;

public class CustomerClass
{
    public static void main(String[] args)
    {
        String memberClass = "Silver";
        
        switch (memberClass)
        {
            // Java7버전 이후부터 String 문자열도 쓸수있다.
            case "silver":
                System.out.println("Go to upstair");
                break;
            case "Silver":
                System.out.println("Go to downstair");
                break;
            case "gold" :
                System.out.println("Go to limousine");
                break;
        }
    }
}
