package chapter5;

public class MethodExample1
{
    public static void main(String[] args)
    {
        String firstName = "Benjamin";
        String lastName = "Roh";
        
        MethodExample1 example1 = new MethodExample1();
        String fullName = example1.merge(firstName, lastName);
        int nameLength = example1.getLength(fullName);
        
        System.out.println("Full name = " + fullName + ", Length = " + nameLength);
        
    }

    public int getLength(String fullName)
    {
        if (fullName == null || "".equals(fullName))
        {
            return 0;
        }
        return fullName.length();
    }

    public String merge(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }
}
