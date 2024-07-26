
import java.util.Comparator;
import java.util.PriorityQueue;

public class Example25July6queuejava {
public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();
    pq.add("A");
    pq.add("B");
    pq.add("C");
    pq.add("D");
    pq.add("E");
    System.out.println(pq);
    Comparator<String> comp=pq.comparator();
    System.out.println(comp+"this is the comparator");
}    
}
