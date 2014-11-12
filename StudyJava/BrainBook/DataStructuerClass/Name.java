package DataStructuerClass;

public class Name
{
    String firstName;
    
    String lastName;
    
    Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // put,get,remove 메소드는 통 번호를 계산해서 데이터가 있는 통을 찾고 난 다음, 그 통 안에 있는 여러 데이터들 중에
    // 똑같은 키 값을 갖는 데이터를 찾기 위해 equals메소드를 사용한다.
    // 해서 equals 메서드를 오버라이딩하여 선언한다.
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Name)) { return false; }
        Name name = (Name) obj;
        if (firstName.equals(name.firstName) && lastName.equals(name.lastName))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int hashCode()
    {
        return firstName.hashCode() + lastName.hashCode();
    }
    
}
