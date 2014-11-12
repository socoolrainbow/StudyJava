package DataStructuerClass;

import java.util.ArrayList;

public class ArrayListExample2
{
    public static void main(String[] args)
    {
        /*
         * ArrayList에 데이터를 삽입/수정/삭제하는 예제  
         */
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("포도");
        list.add("딸기");
        list.add("복숭아"); 
        // 포도 딸기 복숭아 순서
        list.add(2, "키위");
        // 포도 딸기 키위 복숭아
        list.add(0, "오렌지");
        // 오렌지 포도 딸기 키위 복숭아
        list.remove(1);
        // 오렌지 딸기 키위 복숭아
        list.remove("키위");
        // 오렌지 딸기 복숭아
        
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++)
        {
            String str = list.get(cnt);
            System.out.println(str);
        }
        
        
        
        
        
    }
}
