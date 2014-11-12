package IO;
import java.io.Serializable;


public class Emp implements Serializable //��ü����ȭ�� �ϱ����� ����
{
    private int no;
    private String name;
    private String job;
    private int dept;
    private double point;
    
    public Emp(int no, String name, String job, int dept, double point)
    {
        super();
        this.no = no;
        this.name = name;
        this.job = job;
        this.dept = dept;
        this.point = point;
    }
    
    public String toString()
    {
        return no+"\t" + name + "\t" + job + "\t" + dept + "\t" + point;
    }
}
