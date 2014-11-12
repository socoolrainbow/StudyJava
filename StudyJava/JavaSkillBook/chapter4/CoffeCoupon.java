package chapter4;

public class CoffeCoupon
{
    
    public static void main(String[] args)
    {
        if (args == null || args.length ==0)
        {
            System.out.println("Usage : java CoffeeCoupon [countOfStamp]");
            return;
        }
        
        int stampCount = Integer.parseInt(args[0]);
        if (stampCount >=0 && stampCount < 3)
        {
            System.out.println("Need more stamps");
        }
        else if (stampCount >= 3 && stampCount <6) {
            System.out.println("Free cookie");
        }
        else if (stampCount >= 6) {
            System.out.println("Free coffee");
        }
        else {
            System.out.println("Useless coupon");
        }
    }
    
}
