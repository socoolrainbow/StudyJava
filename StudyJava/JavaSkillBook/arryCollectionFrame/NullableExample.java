package arryCollectionFrame;

import java.util.ArrayList;

// NullPointerException 에러를 방지하는 세가지 방법
public class NullableExample
{
    public static void main(String[] args)
    {
        NullableExample example = new NullableExample();
        
        ArrayList<String> strList = NullableExample.init();
        // Exception은 strList.size() 메소드를 호출할수 없어서 발생한다. strList = null 이므로 아래와
        // 같이 예외상황을 발생시키지않도록 한다.
        // if (strList != null && strList.size() > 0)
        {
            for (int i = 0; i < strList.size(); i++)
            // 아래와 같이 예외상황을 방지할수도 있다.
            // for (int i = 0 ; strList != null && i < strList.size(); i++)
            {
                System.out.println("member value : " + strList.get(i));
            }
        }
        
    }
    
    public static ArrayList<String> init()
    {
        return null;
    }
}
