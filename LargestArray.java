public class LargestArray
{
    public static void main(String[]args)
    {
        int [][][] Largest={{{21,31,14},{14,314,31},{1111,22,23,13}}};
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                for(int k=0;k<=2;k++)
                {
                    System.out.println(Largest[i][j][k]);
                }
            }
        }
    }
}