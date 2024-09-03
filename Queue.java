import java.util.PriorityQueue;
import java.util.Queue; 
public class QueueDemo
 {
    public static void main(String[] args) 
    {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("U.K.");
        queue.add("Canada");
        queue.add("U.S.");
        System.out.println("Original queue: " + queue);
        queue.remove(); 
        System.out.println("Queue after removing the head element: " + queue);
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);
        head = queue.poll(); 
        System.out.println("Removed head: " + head);       
        System.out.println("Queue now looks like this: " + queue);
    }
}