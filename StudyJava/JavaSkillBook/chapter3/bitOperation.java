package chapter3;

public class bitOperation
{
    
    public static void main(String[] args)
    {
        // XOR('^') 연산은 값이 서로 다를경우 True로 연산된다.
        int b1 = 0B0010;
        int b2 = 0B0101;
        int b3 = 0B1111;
        
        int rtAndOP = b1 & b3;
        int rtOrOp = b1 | b2;
        int rtXorOp = b1 ^ b3;
        
        System.out.println("b1 AND b3 : " + Integer.toBinaryString(rtAndOP));
        System.out.println("b1 OR b2 : " + Integer.toBinaryString(rtOrOp));
        System.out.println("b1 XOR b3 : " + Integer.toBinaryString(rtXorOp));
        
    }
    
}
