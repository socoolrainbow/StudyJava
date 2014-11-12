package IO;
import java.io.Serializable;


public class Emp implements Serializable //객체직렬화를 하기위해 구현
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
