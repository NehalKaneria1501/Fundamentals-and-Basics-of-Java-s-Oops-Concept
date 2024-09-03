import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;
public class StreamDemo 
{
    public static void main(String[] args) 
    {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        List<Integer> squaresList = new ArrayList<>();
        for (Integer i : numberList) 
        {
            squaresList.add(i * i);
        }
        System.out.println("List of squared numbers (using traditional for-loop): " + squaresList);
        List<Integer> squaresListStream = numberList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("List of squared numbers (using streams): " + squaresListStream);
        Set<Integer> squareSet = new HashSet<>();
        for (Integer i : numberList) 
        {
            squareSet.add(i * i);
        }
        System.out.println("Set of squared numbers (using traditional for-loop): " + squareSet);
        Set<Integer> squareSetStream = numberList.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("Set of squared numbers (using streams): " + squareSetStream);
        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("kotlin");
        languages.add("dart");
        List<String> filteredList = languages.stream().filter(s -> s.startsWith("j")).collect(Collectors.toList());
        System.out.println("Languages starting with 'j': " + filteredList);
        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted alphabetically: " + sortedList);
        System.out.println("Printing all elements squared:");
        numberList.stream().map(x -> x * x).forEach(y -> System.out.println("Element is: " + y));
        int sum = numberList.stream().reduce(0, (ans, i) -> ans + i);
        System.out.println("Sum of all elements in numberList: " + sum);
    }
}