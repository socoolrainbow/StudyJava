package chapter2;

import java.util.Calendar;
import java.util.Date;

public class ReferenceExample
{
    
    public static void main(String[] args)
    {
        String lastName = "Roh";
        String firstNme = new String("Hyunsoo");
        
        Date endDate = new Date();
        Date nowDate = Calendar.getInstance().getTime();
        
        System.out.println("My full name is " + firstNme + " " + lastName);
        System.out.println(endDate);
        System.out.println(nowDate);
        
    }
    
}
