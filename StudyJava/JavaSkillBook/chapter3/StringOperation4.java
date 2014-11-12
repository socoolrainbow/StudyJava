package chapter3;

public class StringOperation4
{
    public static void main(String[] args)
    {
        if (args == null || args.length != 1)
        {
            System.out
                    .println("Help : java StrigOperation4 [Single character]");
            return;
        }
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        
        String str = args[0];
        String temp = str.toLowerCase();
        
        int alphabetIdx = alphabet.indexOf(temp);
        int numberIdx = number.lastIndexOf(temp);
        
        System.out.println("Input character : " + str);
        System.out.println("Alphabet? : " + ((alphabetIdx >= 0) ? "true" : "false"));
        System.out.println("Number? : " + ((numberIdx >= 0) ? "true" : "false"));
    }
}
