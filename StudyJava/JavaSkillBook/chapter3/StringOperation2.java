package chapter3;

public class StringOperation2
{
    public static void main(String[] args)
    {
        String coffee1 = "Americano";
        String coffee2 = "Americano";
        System.out.println("coffee1 and coffee2 : "
                + ((coffee1 == coffee2) ? "same" : "not same"));
        
        String coffee3 = new String("Americano");
        String coffee4 = new String("Americano");
        System.out.println("coffee3 and coffee4 : "
                + ((coffee3 == coffee4) ? "same" : "not same"));
        
        System.out.println(coffee1 + "," + System.identityHashCode(coffee1));
        System.out.println(coffee1 + "," + System.identityHashCode(coffee2));
        System.out.println(coffee1 + "," + System.identityHashCode(coffee3));
        System.out.println(coffee1 + "," + System.identityHashCode(coffee4));
        /*
         * 문자열 철자를 비교할 때는 equals()라는 메소들를 사용하고, JVM 메모리에 위치한 문자열의 위치가 같은지 비교할 때는
         * '==' 연산자를 사용한다.
         */
    }
}
