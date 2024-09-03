public class Student 
{
    private String name;
    private int age;
    private String address;
    public Student(String name, int age, String address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() 
    {
        int i = 1;
        String returnVar = null; 
        if (i == 1) 
        {
            returnVar = "test";
        } 
        else
         {
            returnVar = name;
        }
        return returnVar;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    @Override
    public String toString() 
    {
        return "Student{name='" + name + "', age=" + age + ", address='" + address + "'}";
    }
    public static void main(String[] args) 
    {
        Student pari = new Student("Pari", 24, "Mississauga, ON");
        System.out.println(pari.getName());
        System.out.println(pari.getAge());
        System.out.println(pari.getAddress());
        System.out.println(pari.toString());
    }
}