package chapter9_Thread;

// 은행의 경우 돈을 입출금할경우 동기화가 절대적으로 필요하다. 주의!
public class Bank
{
    // 동기화를 같이 진행하는 메서드들을 Object로 관리해서 따로 각각 실행돼지 않도록 할수있다.
    private Object obj = new Object();
    private String account;
    
    private int money;
    
    public Bank(String acount, int money)
    {
        this.account = acount;
        this.money = money;
     
    }
    
    // 입금
    public void deposit(int money)
    {
        synchronized (obj)
        {
            this.money += money;
        }
    }
    
    // 출금
    // 메서드의 구성을 유심히보자! 프로그래밍을 추상화할경우를 가정해보자.
    public boolean withdraw(int money)
    {
        synchronized (obj)
        {
            if (this.money >= money)
            {
                this.money -= money;
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
    public String getAcount()
    {
        return account;
    }
}
