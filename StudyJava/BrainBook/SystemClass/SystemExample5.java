package SystemClass;

import java.util.Properties;

public class SystemExample5
{
    public static void main(String[] args)
    {
        // System Property를 읽어오는 프로그램
        // 시스템프로퍼티는 자바 프로그램의 실행환경에 대한 여러가지 정보를 담ㄴ는 역할을 하는 일종의 변수이다.
        // 시스템 프로퍼티는 자바 가상 기ㅖ가 자바 프로그램을 시작할 때 운영체제로 부터 읽어와서 자동으로 설정한다.
        Properties props = System.getProperties();
        props.list(System.out);
    }
}
