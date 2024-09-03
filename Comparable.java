import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student> 
{
    int id;
    String name;
    int age;
    Student(int id, String name, int age) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Student other) 
    {
        return Integer.compare(this.id, other.id); 
    }
    public String getName() 
    {
        return name;
    }
}
class ComparableDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Pari", 24));
        list.add(new Student(1, "Paru", 23));
        list.add(new Student(2, "Parudi", 22));
        Collections.sort(list);
        System.out.println("Students after sorting:");
        list.forEach(student -> System.out.println(student.getName()));
    }
}