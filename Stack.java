import java.util.Stack;
public class StackDemo 
{
    public static void main(String[] args) 
    {
        Stack<String> stack = new Stack<>();
        stack.push("U.S.");
        stack.push("Canada");
        stack.push("U.K.");
        System.out.println("Stack: " + stack);
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        String poppedElement1 = stack.peek();
        System.out.println("Top element: " + poppedElement1);       
        System.out.println("Stack after peek: " + stack);
    }
}