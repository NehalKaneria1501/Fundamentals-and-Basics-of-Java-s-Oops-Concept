class OuterClass 
{
    int instanceMember = 20;
    private static int outerPrivateMember = 30;
    static int outerStaticMember = 10;
    static class StaticNestedClass 
    {
        void display() 
        {
            System.out.println("Static member of outer class = " + outerStaticMember);
            System.out.println("Private static member of outer class = " + outerPrivateMember);
        }
    }
    class InnerClass 
    {
        public void main(String[] args) 
        {
            OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
            nestedObject.display();
            OuterClass outerClass = new OuterClass();
            outerClass.outerClassMethod();
        }
    }
    void outerClassMethod() 
    {
        System.out.println("outerClassMethod called");
        class MethodLocalClass
        {
            void localInnerMethod()
            {
                System.out.println("In the method local class:Method");
            }
        }
        MethodLocalClass nlc=new MethodLocalClass();
        nlc.localInnerMethod();
    }
}