package chapter7;

import java.util.Random;

public class RandomExample
{
    // random함수는 random.nextInt(randomRange)를 예를들어 randomRange가 10이라면 0~9까지의 난수가 발생한다. 따라서 1~10까지의
    // 난수를 발생시키려면 random.nextInt(randomRange)+1 과 같이 사용해야한다.
    private final int randomRange = 10;
    private int loopCount = 1000000;
    private int[] randomTable = new int[randomRange];
    private Random random = new Random(2);
    
    public static void main(String[] args)
    {
        RandomExample exam = new RandomExample();
        exam.init();
        exam.generate();
        exam.printStatus();
    }
    
    public void init()
    {
        for (int i = 0; i < randomTable.length; i++)
        {
            randomTable[i] = 0;
        }
    }
    
    public void generate()
    {
        for (int i = 0; i < loopCount; i++)
        {
            int randomVlu = random.nextInt(randomRange);
            randomTable[randomVlu]++;
        }
    }
    
    public void printStatus()
    {
        for (int i = 0; i < randomTable.length; i++)
        {
            System.out.println("Random value (" + i + ") = " + randomTable[i]);
        }
    }
    
}
