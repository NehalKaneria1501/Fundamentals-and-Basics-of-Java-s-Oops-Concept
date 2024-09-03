public class NonPrimitiveDataTypes 
{
    public static void main(String[]args) 
    {
        String str="test";
        System.out.println("Another string:"+str);
        String str1=new String("test");
        System.out.println("Another string:"+str1);
        int arr[]=new int[3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        System.out.println("Array:"+java.util.Arrays.toString(arr)); 
        System.out.println("First element:"+arr[0]);
    }
}