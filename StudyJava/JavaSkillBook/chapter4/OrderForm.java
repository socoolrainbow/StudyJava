package chapter4;

public class OrderForm
{
    
    public static void main(String[] args)
    {
        // 아래는 예시이며 이런식으로 코딩하면 가독성도 많이 떨어지고, 복잡해짐으로 OrderForm2 형식으로 만들자!
        if (args == null || args.length == 0)
        {
            System.out
                    .println("Usage : java OrderForm [Coffee name]. [number of coffee]");
        }
        // 매개변수가 1개인 경우
        else if (args.length == 1)
        {
            System.out.println("Please input number of coffee");
            System.out
                    .println("Usage : java OrderForm [Coffee name], [number of coffee]");
        }
        else if (args.length == 2)
        {
            String coffeeName = args[0];
            // 2-depth if 구문
            if ("espresso".equalsIgnoreCase(coffeeName))
            {
                String verb = "";
                int count = Integer.parseInt(args[1]);
                // 3-depth if구문
                if (count == 1)
                {
                    verb = "is";
                }
                else
                {
                    verb = "are";
                }
                System.out.println("Here " + verb + " " + args[1]
                        + " cup(s) of " + coffeeName);
            }
            else
            {
                System.out.println("Sorry. it is out of stock");
            }
        }
        // 매개변수가 3개 이상인 경우
        else
        {
            System.out
                    .println("Usage : java OrderForm [Coffee name], {number of coffee]");
        }
    }
    
}
