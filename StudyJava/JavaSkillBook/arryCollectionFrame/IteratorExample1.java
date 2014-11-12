package arryCollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample1
{
    private ArrayList<String> urlList = new ArrayList<String>();
    
    public static void main(String[] args)
    {
        IteratorExample1 example = new IteratorExample1();
        example.init();
        example.execute();
    }
    
    public void init()
    {
        urlList.add("http://www.daum.net");
        urlList.add("http://www.google.co.kr");
        urlList.add("http://www.facebook.com");
        urlList.add("http://www.naver.com");
    }
    
    public void execute()
    {
        for (int j = 0; j < urlList.size(); j++)
        {
            System.out.println("URL : " + urlList.get(j));
        }
        System.out.println("-----------------------------------------");
        
        for (String url : urlList)
        {
            System.out.println("URL : " + url);
        }
        System.out.println("-----------------------------------------");
        
        // iterator를 인스턴스화 하고 urlList를 받아 선언한다.
        Iterator<String> iter = urlList.iterator();
        while (iter.hasNext())
        {
            System.out.println("URL :" + (String) iter.next());
        }
    }
    
}
