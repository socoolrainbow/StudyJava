package WrapperClass;

public class WrapperExample4
{
    public static void main(String[] args)
    {
        Integer obj = new Integer("10");
        // 프리미티브 다입의 값이 자동으로 Unboxing된다.
        // Integer객체와 int타입의 값을 +연산자로 더하고 있습니다. 그런데 + 연산자는 래퍼 객체를 더하는 연산자가 아니라
        // 프리미티브 타입의 값을 더하는 연산자 입니다. 그래서 이 경우에는 Integer객체로부터 int값이 자동으로 추출된 후에 +
        // 연산이 이루어 진다.
        int sum = obj + 20;
        System.out.println(sum);
    }
}
