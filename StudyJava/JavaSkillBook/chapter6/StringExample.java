package chapter6;

public class StringExample
{
    public static void main(String[] args)
    {
        StringExample strExam = new StringExample();
        System.out.println(strExam.getDescription());
    }
    
    public String getDescription()
    {
        String rt = "Java ";
        rt += "is ";
        rt += "a ";
        rt += "programming ";
        rt += "language ";
        rt += "originally ";
        rt += "developed ";
        rt += "by ";
        rt += "James ";
        rt += "Gosling ";
        rt += "at ";
        rt += "Sun ";
        rt += "Microsystems";
        return rt;
        
    }
}
