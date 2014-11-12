package chapter2;

public class VariableHashcode2
{
    
    public static void main(String[] args)
    {
        String varStr1 = "";
        String varStr2 = null;
        
        System.out.println("varStr1 : " + System.identityHashCode(varStr1));
        System.out.println("varStr2 : " + System.identityHashCode(varStr2));
    }
    
}
