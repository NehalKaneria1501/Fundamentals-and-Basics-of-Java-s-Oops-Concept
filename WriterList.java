public java.util.ArrayList;
public class WriterHelper
{
    public void WriterList()
    {
        try
        {
            List<Integer> List=new ArrayList<>(10);
            list.add(1);
            System.out.println("Entering"+"try statement");
            Integer a=list.get(1);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.err.println("accessing the first element:"+a);
        }
        finally
        {
            System.out.println("this will always be executed");
        }
    }
}