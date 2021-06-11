package errorhandling;

public class main {
    public static void main(String[] args) {
        exceptionClass ec = new exceptionClass();
        exceptionClass ec1 = null;
        try {
            ec.methodToShowException("17311a05l5", 1, "lAVANYA");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try
    {
        ec1.methodToShowException("17311a05l5", 10, "LAVANYA");
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
                System.out.println("It just executes");
            }
        }
}
