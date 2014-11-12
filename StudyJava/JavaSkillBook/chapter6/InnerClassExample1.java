package chapter6;

public class InnerClassExample1
{
     private int outerHashCode;
     public String outerClassName;
     static boolean isOuter;
     
     public InnerClassExample1()
    {
         outerHashCode = System.identityHashCode(this);
         outerClassName = this.getClass().getName();
         isOuter =true;
    }
    public static void main(String[] args)
    {
        // 외부 클래스 객체 example 생성
        InnerClassExample1 example = new InnerClassExample1();
        
        //example 객체를 사용하여 내부 클래스 객체 innerExample 생성
        //inner 클래스를 인스턴스하는 가장 중요한 구문 중요~!
        InnerClassExample1.InnerClass innerExample = example.new InnerClass();
        
        innerExample.printInnerInfo();
        System.out.println("-------------------------------");
        innerExample.printOuterInfo();
        
    }
    
    class InnerClass
    {
        private int innerHashCode;
        public String innerClassName;
        // final 키워드는 단독으로 사용불가
        static final boolean isInner = true;
        
        public InnerClass()
        {
            innerHashCode = System.identityHashCode(this);
            innerClassName = this.getClass().getName();
        }
        
        // 내부 클래스는 여러가지 접근 제어자로 선언된 클래스 변수에 접근할 수 있다.
        public void printOuterInfo()
        {
            System.out.println("Outer object HashCode : " + outerHashCode);
            System.out.println("Outer object class Name : " + outerClassName);
            System.out.println("Is it outer class :" + isOuter);
        }
        
        // 내부 클래스 자신의 변수에도 접근할 수 있다.
        public void printInnerInfo()
        {
            System.out.println("Inner object HashCode : "+ this.innerHashCode);
            System.out.println("Inner object class Name: "+ this.innerClassName);
            System.out.println("Is it inner class :" + isInner);
        }
    }
    
}
