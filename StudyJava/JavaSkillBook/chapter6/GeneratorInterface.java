package chapter6;

public interface GeneratorInterface
{
    public static final String ID_HEADER = "UNIQUE";
    public static final String DELIMITER = "_";
    public abstract String getUniqueValue();
    
}
