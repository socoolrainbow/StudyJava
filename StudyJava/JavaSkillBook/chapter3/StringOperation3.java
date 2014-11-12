package chapter3;

public class StringOperation3
{
    
    public static void main(String[] args)
    {
        String coffee1 = new String("Americano");
        String coffee2 = new String("Americano");
        String coffee3 = new String("AmeRicAnO");
        String coffee4 = new String("Blue mountin");
        String coffee5 = new String("Cappuccino");
        
        // '==' 비교는 주소값을 비교함으로 같은 데이터가 들어있으나 주소가 다름.
        System.out.println((coffee1 == coffee2) ? "equal" : "not equal");
        // equals()메서드로 비교할경우 데이터값을 서로 비교하게됨으로 같음.
        System.out.println((coffee1.equals(coffee2)) ? "equal" : "not equal");
        System.out.println((coffee1.equals(coffee3)) ? "equal" : "not equal");
        // equalsIgnoreCase() 메소드는 대소문자 구분없이 실제 데이터를 비교한다.
        System.out.println((coffee1.equalsIgnoreCase(coffee3)) ? "equal" : "not equal");
        
        // compareTo(x) 메서드는 반환값이 0이면 두 문자열은 같고, 양수면 대상 문자열이 x보다 뒤에 있고, 음수면 대상 문자열이 x보다 앞에 있다.  
        System.out.println(coffee4.compareTo(coffee3));
        System.out.println(coffee4.compareTo(coffee5));
        System.out.println(coffee5.endsWith("A"));
        System.out.println(coffee5.endsWith("no"));
        System.out.println(coffee5.startsWith("C"));
    }
    
}
