import java.util.ArrayList;
import java.util.List;
public class WriterHelper 
{
    public void writeList() 
    {
        Integer a = null; 
        try 
        {
            List<Integer> list = new ArrayList<>(10);
            list.add(1);
            System.out.println("Entering"+"try statement");
            a = list.get(1); 
            System.out.println("accessing the first element:"+a);
        } 
        catch (IndexOutOfBoundsException e) 
        {
            System.err.println("Caught IndexOutOfBoundsException: accessing the element at index 1"+e.getMessage());
        } 
        finally 
        {
            System.out.println("this will always be executed");
        }
    }
}