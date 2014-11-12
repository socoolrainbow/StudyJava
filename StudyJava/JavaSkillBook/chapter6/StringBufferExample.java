package chapter6;

public class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBufferExample sbExam = new StringBufferExample();
        System.out.println(sbExam.getDescription());
    }
    
    public String getDescription()
    {
        StringBuffer sb = new StringBuffer("Java ");
        sb.append("is ").append("a ").append("programming ").append("language ");
        sb.append("originally ");
        sb.append("developed ");
        sb.append("by ");
        sb.append("James ").append("Gosling ");
        sb.append("at ").append("Sun ").append("Microsystems");
        return sb.toString();
    }
}
