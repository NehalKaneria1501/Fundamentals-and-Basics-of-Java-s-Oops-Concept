class ComplexFunction 
{
    int calculateFactorial(int n) 
    {
        if (n == 1) 
        {
            return 1;
        } 
        else
         {
            return n * calculateFactorial(n - 1);
        }
    }
    public static void main(String[] args) 
    {
        ComplexFunction complexFunction = new ComplexFunction();
        int n = 5; 
        int factorial = complexFunction.calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}