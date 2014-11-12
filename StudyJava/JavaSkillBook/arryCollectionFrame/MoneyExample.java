package arryCollectionFrame;

public class MoneyExample
{
    private MoneyVaue moneyVo = new MoneyVaue();
    
    public static void main(String[] args)
    {
        MoneyExample example = new MoneyExample();
        example.init();
        example.add();
        example.printStatus();
        
    }

    public void init()
    {
        moneyVo.userName = "Hyunsoo";
        moneyVo.money = 34.44F;
    }

    public void add()
    {
        int balance = (int)(moneyVo.money +1);
        moneyVo.money = (float)balance;
    }

    public void printStatus()
    {
        System.out.println("Current Balance = " + moneyVo.money + "$");
    }
}
