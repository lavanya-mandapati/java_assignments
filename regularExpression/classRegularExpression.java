package regularExpression;
import java.util.regex.*;
public class classRegularExpression {
    public void display(String str)
    {
        boolean b = Pattern.matches("[A-Z][A-Za-z].*\\.",str);
        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
