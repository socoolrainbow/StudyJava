package chapter8_ExceptionHandling;

public class SampleException3
{
    public static void main(String[] args)
    {
        SampleException3 sample = new SampleException3();
        String[] array = null;
        sample.printList(array);
    }

    public void printList(String[] array)
    {
        // printList 메소드가 호출되면 beginTime 변수에 현재 시각을 설정
        double beginTime = System.nanoTime();
        try
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // finally가 실행될 때의 시간에서 beginTime을 빼면 실제로 실행된 시간이 계산된다.
            double execTime = (System.nanoTime() - beginTime) / 1000000;
            System.out.println("Processing time : " + execTime + " ms");
        }
    }
}
