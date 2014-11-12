package DataStructuerClass;

import java.util.LinkedList;

public class LinkedListExample3
{
    public static void main(String[] args)
    {
        /*
         * LinkedList 클래스를 스택으로 사용하는 예제
         */
        LinkedList<Integer> stack = new LinkedList<Integer>();
        // addLast메서드를 사용하여 후입선출방식인 스텍 방식으로 데이터를 배열할수있다.
        stack.addLast(new Integer(12));
        stack.addLast(new Integer(59));
        stack.addLast(new Integer(7));
        while (!stack.isEmpty())
        {
            // removeLast메서드를 사용하여 마지막의 베열의 값을 읽어들이고 해당 배열을 삭제한다.
            Integer num = stack.removeLast();
            System.out.println(num);
        }
    }
}
