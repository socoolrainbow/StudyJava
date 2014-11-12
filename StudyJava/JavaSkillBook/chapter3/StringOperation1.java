package chapter3;

public class StringOperation1
{
    public static void main(String[] args)
    {
        String target = "Welcome to Java World";
        
        System.out.println(target.concat(" and Gilbut press"));
        System.out.println(target.substring(11));
        System.out.println(target.substring(11, 16));
        System.out.println(target.replace('o', 'O'));
        System.out.println(target.replace("Java", "Gilbut"));
        System.out.println(target.toLowerCase());
        System.out.println(target.toUpperCase());
    }
}
