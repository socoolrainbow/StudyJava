package chapter6;

import java.util.Date;

public class InnerClassExample3
{
    public static void main(String[] args)
    {
        InnerClassExample3 example = new InnerClassExample3();
        example.printStatus();
    }
    
    public void printStatus()
    {
        class DateFormat
        {
            private Date date;
            
            // 지역 내부 클래스 DateFormat 생성자
            public DateFormat(Date date)
            {
                this.date = date;
            }
            
            //지역 내부 클래스 DateFormat의 메소드
            public String getDateFormat()
            {
                return date.toString();
            }
        }
        
        DateFormat format = new DateFormat(new Date());
        System.out.println("The Date : " + format.getDateFormat());
        
    }
}
