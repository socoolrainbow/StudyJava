package DataStructuerClass;

import java.util.ArrayList;

public class ArrayListExample3
{
    public static void main(String[] args)
    {
        /*
         * ArrayList의 데이터를 검색하는 예제
         */
        ArrayList<String> list = new ArrayList<String>();
        list.add("머루");
        list.add("사과");
        list.add("앵두");
        list.add("자두");
        list.add("사과");
        int index1 = list.indexOf("사과");
        int index2 = list.lastIndexOf("사과");
        System.out.println("첫버째 사과 : " + index1);
        System.out.println("마지막 사과 : " + index2);
    }
}
