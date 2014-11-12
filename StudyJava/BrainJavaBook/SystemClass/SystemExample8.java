package SystemClass;

public class SystemExample8
{
    public static void main(String[] args)
    {
        /*
         * gc메소드
         * 가비지 컬렉터가 더 빨리 일을 하도록 만들어야 할때 System클래스의 gc메소드를 사용하면 된다.
         * System.gc(); 가비지 컬렉터가 가급적 빨리 일을 하도록 자바 가상 기계에게 요청하는 메소드
         * 
         */
        ResourceUser obj = new ResourceUser();
        obj.use();
        obj = null;
        System.gc();
    }
}
