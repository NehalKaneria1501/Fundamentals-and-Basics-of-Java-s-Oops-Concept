class InnerClass 
{
    public static void main(String[] args)
    {
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
        OuterClass outerClass = new OuterClass();
        outerClass.outerClassMethod();
    }
}
class OuterClass 
{
    static int outerStaticMember = 10;
    int instanceMember = 20;

    static class StaticNestedClass 
    {
        void display() 
        {
            System.out.println("Display method of StaticNestedClass");
        }
    }
    void outerClassMethod() 
    {
        System.out.println("outerClassMethod called");
    }
}