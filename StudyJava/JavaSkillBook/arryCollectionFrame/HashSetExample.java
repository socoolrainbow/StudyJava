package arryCollectionFrame;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample
{
    
    private int count = 0;
    
    private Random random = new Random();
    
    private HashSet<Integer> set = new HashSet<Integer>();
    
    public static void main(String[] args)
    {
        HashSetExample example = new HashSetExample();
        example.init();
        example.execute();
        
    }
    
    public void init()
    {
        for (int i = 0; i < 10; i++)
        {
            set.add(random.nextInt(10));
        }
        this.printStatus(set);
    }
    
    public void execute()
    {
        HashSet<Integer> setObj = new HashSet<Integer>();
        for (int i = 0; i < 10; i++)
        {
            // 10 미만의 랜덤한 정수를 set객체에 추가
            setObj.add(random.nextInt(5));
        }
        
        this.printStatus(setObj);
        set.addAll(setObj);
        this.printStatus(set);
    }
    
    public void printStatus(HashSet<Integer> hashSet)
    {
        // 데이터가 있는지를 먼저 검사
        if (hashSet == null || hashSet.size() == 0)
        {
            System.out.println("Object is null or size is zero");
        }
        count++;
        
        // 배열로 내부 개수 확인
        Integer[] array = hashSet.toArray(new Integer[hashSet.size()]);
        System.out.print("count : " + count + ", ");
        for (Integer item : array)
        {
            System.out.print("[" + item + "] ");
        }
        System.out.println("\n");
    }
}
