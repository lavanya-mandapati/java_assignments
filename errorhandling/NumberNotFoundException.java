package errorhandling;

public class NumberNotFoundException extends Exception{
    public NumberNotFoundException(String message)
    {
        super(message);
    }
}
