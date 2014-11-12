package arryCollectionFrame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortExample
{
    private final int LENGTH = 15;
    
    private Random random;
    
    private String[] strArray;
    
    private ArrayList<String> strList;
    
    public static void main(String[] args)
    {
        SortExample example = new SortExample();
        example.init();
        example.sort();
    }
    
    public void init()
    {
        this.random = new Random();
        strArray = new String[this.LENGTH];
        strList = new ArrayList<String>();
        
        for (int i = 0; i < LENGTH; i++)
        {
            // 65이상의 수자가 셋팅 저장됨으로 A~Z 까지의 난수 입력
            String item = String.valueOf((char) (random.nextInt(26) + 65));
            strArray[i] = item;
            strList.add(item);
        }
        this.printArrayItem();
        this.printArryListItem();
    }
    
    public void printArrayItem()
    {
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print("[" + strArray[i] + "] ");
        }
        System.out.println();
    }
    
    public void printArryListItem()
    {
        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print("(" + strList.get(i) + ") ");
        }
        System.out.println();
    }
    
    public void sort()
    {
        // 정렬 메소드를 이용한 정렬
        Arrays.sort(strArray);
        Collections.sort(strList);
        
        this.printArrayItem();
        this.printArryListItem();
    }
    
}
