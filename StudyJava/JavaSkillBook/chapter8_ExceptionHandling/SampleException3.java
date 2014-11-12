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
        // printList �޼ҵ尡 ȣ��Ǹ� beginTime ������ ���� �ð��� ����
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
            // finally�� ����� ���� �ð����� beginTime�� ���� ������ ����� �ð��� ���ȴ�.
            double execTime = (System.nanoTime() - beginTime) / 1000000;
            System.out.println("Processing time : " + execTime + " ms");
        }
    }
}
