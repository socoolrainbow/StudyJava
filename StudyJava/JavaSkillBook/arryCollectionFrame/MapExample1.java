package arryCollectionFrame;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// 간단한 ASCII코드 반환예제
public class MapExample1
{
    //Key = 대문자 알파벳, Value = 10진 ascii코드
    private HashMap<String, Integer> asciiMap = new HashMap<String, Integer>();
    
    public static void main(String[] args)
    {
        MapExample1 example = new MapExample1();
        example.init();
        example.execute();
    }

    public void init()
    {
        for (int i = 65; i <= 90; i++)
        {
            // 65는 ASCII = 'A'
            asciiMap.put(String.valueOf((char)i), i);
        }
    }

    public void execute()
    {
        // entrySet() 메소드 사용방법
        Set<Entry<String, Integer>> entrySet = asciiMap.entrySet();
        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.print("[" + entry.getKey() + "/" + entry.getValue() + "] ");
        }
        System.out.print("\n");
        
        System.out.println();
        System.out.println("asciiMap contains 69 value : " + asciiMap.containsValue(69));
        System.out.println("asciiMap contains C key : " + asciiMap.containsKey("C"));
        
        // remove
        asciiMap.remove("Z");
        
        //values() 메소드를 이용한 value값 출력
        Collection<Integer> values = asciiMap.values();
        for (Integer value : values)
        {
            System.out.print("(" + value + ") ");
        }
        System.out.print("\n");
        
        //keySet() 메소드를 이용한 value 값 출력
        Set<String> keySet = asciiMap.keySet();
        for (String key : keySet)
        {
            System.out.print("[" + asciiMap.get(key) + "] ");
        }
        System.out.println();
        
    }
}
