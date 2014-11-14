package chapter7;

import java.util.Random;

public class RandomExample
{
    // random�Լ��� random.nextInt(randomRange)�� ������� randomRange�� 10�̶�� 0~9������ ������ �߻��Ѵ�. ���� 1~10������
    // ������ �߻���Ű���� random.nextInt(randomRange)+1 �� ���� ����ؾ��Ѵ�.
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
