package arryCollectionFrame;
// get/set ter»ç¿ë
public class MemberValue
{
    private int memberId;
    private String phoneNumber;
    private String name;
    private long mileage;
    
    public MemberValue()
    {
        this.memberId = 0;
        this.mileage = 0;
    }
    
    public int getMemberId()
    {
        return memberId;
    }

    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getMileage()
    {
        return mileage;
    }

    public void setMileage(long mileage)
    {
        this.mileage = mileage;
    }
}
