import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student 
{
    int id;
    String name;
    int age;
    public Student(int id, String name, int age) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
}
class AgeComparator implements Comparator<Student> 
{
    @Override
    public int compare(Student s1, Student s2) 
    {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Pari", 24));
        list.add(new Student(1, "Paru", 23));
        list.add(new Student(2, "Parudi", 22));
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list, ageComparator);
        System.out.println("Students after sorting by age:");
        list.forEach(student -> System.out.println(student.getName() + " - Age: " + student.getAge()));
        list.add(new Student(4, "Another Pari", 24));
        list.add(new Student(5, "Another Paru", 23));
        list.add(new Student(6, "Another Parudi", 22));
        Collections.sort(list, ageComparator);
        System.out.println("Students after sorting by age (after adding more students):\n");
        list.forEach(student -> System.out.println(student.getName() + " - Age: " + student.getAge()));
    }
}