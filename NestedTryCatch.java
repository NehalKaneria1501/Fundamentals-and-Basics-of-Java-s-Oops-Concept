public class NestedTryCatch 
{
    public static void main(String[] args) 
    {
        try 
        {
            try 
            {
                try 
                {
                    int arr[] = 
                    { 
                        1, 2, 3, 4 
                        };
                    System.out.println(arr[10]);
                } 
                catch (ArrayIndexOutOfBoundsException e) 
                {
                    System.out.println("ArrayIndexOutOfBoundsException in block 3");
                    throw e;
                }
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("ArrayIndexOutOfBoundsException in block 2");
                throw e;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException in block 1");
        } 
    }
}