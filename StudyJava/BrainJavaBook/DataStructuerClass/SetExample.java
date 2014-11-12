package DataStructuerClass;

import java.util.HashSet;
import java.util.Iterator;


public class SetExample
{
    public static void main(String[] args)
    {
        /*
         * 집합으로 사용할수 있는 클래스이다.
         * HashSet의 경우 데이터의 순서가 없으므로 HashSet에 데이터를 순서대로 읽어오거나, 특정 위치의 데이터를 읽어올수 있는 방법은 없다.
         * 하지만 집합에 있는 데이터를 모두 읽어올 수 있는 방법이 있다. LinkedList 클래스에 있는 것과 똑같은 iterator 메소드를 사용하면 된다.
         */
        HashSet<String> set = new HashSet<String>();
        set.add("자바");
        set.add("카푸치노");
        set.add("에스프레소");
        set.add("자바");
        System.out.println("저장되 데이터의 수 = " + set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String str = iterator.next();
            System.out.println(str);
        }
        
    }
}
