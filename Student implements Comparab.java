public class Student implements Comparable<Student> 
{
    private String name;
    private int age;
    private String address;
    private int rollNumber;
    public Student(String name, int age, String address, int rollNumber) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNumber = rollNumber;
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
    public int getRollNumber() 
    {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) 
    {
        this.rollNumber = rollNumber;
    }
    @Override
    public int compareTo(Student student) 
    {
        return Integer.compare(this.rollNumber, student.rollNumber);
    }
    @Override
    public String toString() 
    {
        return "Student{name='" + name + "', age=" + age + ", address='" + address + "', rollNumber=" + rollNumber + "}";
    }
    public static void main(String[] args) 
    {
        Student pari = new Student("Pari", 24, "Mississauga, ON", 1);
        System.out.println(pari.getName());
        System.out.println(pari.getAge());
        System.out.println(pari.getAddress());
        System.out.println(pari.getRollNumber());
        System.out.println(pari.toString());
    }
}
