class MethodCallingDemo 
{
    public static void main(String[] args) 
    {
        int i = 1;
        i = changeValue(i); 
        System.out.println("i is: " + i);
        Student pari = new Student("Pari", 24, "Mississauga, ON");
        pari = changeNameInDifferent(pari); 
        System.out.println(pari.getName());
        System.out.println(pari.getAge());
        System.out.println(pari.getAddress());
    }
    private static int changeValue(int i) 
    {
        i = i + 1;
        return i; 
    }
    private static Student changeNameInDifferent(Student student) 
    {
        Student newStudent = new Student("Pari", student.getAge(), student.getAddress());
        return newStudent; 
    }
}
class Student 
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
        return name;
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
} 