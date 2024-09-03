import java.util.HashSet;
import java.util.Set;
public class HashSetDemo 
{
    public static void main(String[] args) 
    {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        System.out.println("Initial Set: " + hashSet);
        hashSet.remove("A");
        System.out.println("Set after removing A: " + hashSet);
        System.out.println("Iterating through the Set:");
        for (String item : hashSet) 
        {
            System.out.println(item);
        }
    }
}