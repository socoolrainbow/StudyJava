package LinkedListExample2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3
{
    public static void main(String[] args)
    {
        /*
         * Iterator 객체를 사용하여 순차적으로 LinkedList객체를 접근하는 예제 
         */
        LinkedList<String> list = new LinkedList<String>();
        list.add("망고");
        list.add("파인애플");
        list.add("바나나");
        // iterator 메소드를 호출하여 Iterator 객체를 얻는다.
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
