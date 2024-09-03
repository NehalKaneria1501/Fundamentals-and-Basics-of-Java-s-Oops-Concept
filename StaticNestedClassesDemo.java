class OuterClass 
{
    static int outerStaticMember = 10;
    int instanceMember = 20;
    private static int outerPrivateMember = 30;
    static class StaticNestedClass 
    {
        void display() 
        {
            System.out.println("Static member of outer class = " + outerStaticMember);
            System.out.println("Private static member of outer class = " + OuterClass.getOuterPrivateMember());
        }
    }
    public static int getOuterPrivateMember() 
    {
        return outerPrivateMember;
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();
    }
}