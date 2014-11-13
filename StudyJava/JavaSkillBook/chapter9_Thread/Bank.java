package chapter9_Thread;

// ������ ��� ���� ������Ұ�� ����ȭ�� ���������� �ʿ��ϴ�. ����!
public class Bank
{
    // ����ȭ�� ���� �����ϴ� �޼������ Object�� �����ؼ� ���� ���� ������� �ʵ��� �Ҽ��ִ�.
    private Object obj = new Object();
    private String account;
    
    private int money;
    
    public Bank(String acount, int money)
    {
        this.account = acount;
        this.money = money;
     
    }
    
    // �Ա�
    public void deposit(int money)
    {
        synchronized (obj)
        {
            this.money += money;
        }
    }
    
    // ���
    // �޼����� ������ ����������! ���α׷����� �߻�ȭ�Ұ�츦 �����غ���.
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
