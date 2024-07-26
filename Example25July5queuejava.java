
import java.util.PriorityQueue;

public class Example25July5queuejava {
 public static void main(String[] args) {
    PriorityQueue<String> pq= new PriorityQueue<String>();
    pq.add("A");
    pq.add("B");
    pq.add("C");
    pq.add("D");
    pq.add("E");
    System.out.println(pq);
    System.out.println(pq.peek()+"peek");
    System.out.println(pq.poll()+"poll");
    
 }   
}
