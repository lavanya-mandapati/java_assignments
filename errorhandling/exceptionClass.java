package errorhandling;

public class exceptionClass  {
    public void methodToShowException(String id,int num,String name) throws idNotFoundException, NumberNotFoundException, nameNotFoundException,NullPointerException {
        int arr[];
        if(id.equals("17311A05K2"))
            System.out.println("id verified");
        else
        {
            throw new idNotFoundException("not able to find student id");
        }
        if(num==10)
        {
            System.out.println("Number found");
        }
        else
        {
            throw new NumberNotFoundException("number is not found");
        }
        if(name=="LAVANYA")
        {
            System.out.println("matched");
        }
        else
        {
            throw new nameNotFoundException("student name not found");
        }
    }
}
