package DataStructuerClass;

import java.util.LinkedList;

public class LinkedListExample4
{
    public static void main(String[] args)
    {
        /*
         * LinkedList를 선입선출 방식인 큐방식으로 데이터를 처리하는 예제
         */
        LinkedList<String> queue = new LinkedList<String>();
        // offer메서드를 사용하여 데이터를 입력시킨다.
        queue.offer("토끼");
        queue.offer("사슴");
        queue.offer("호랑이");
        while (!queue.isEmpty())
        {
            // poll을 사용하여 데이터를 읽어드리고 해당 데이터는 삭제한다.
            // 만약 데이터만 읽어들이고 데이터를 삭제하지 않으려면 Peek메서드를 사용한다.
            String str = queue.poll();
            System.out.println(str);
        }
    }
}
