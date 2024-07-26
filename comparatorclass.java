
import java.util.Comparator;
import java.util.PriorityQueue;


public class Example25July7comparator {
    public static void main(String[] args) {
    PriorityQueue<String> pq= new PriorityQueue<String>(new comparatorclass());
    pq.add("a");
    pq.add("b");
    pq.add("c");
    pq.add("d");
    pq.add("e");
    while(!pq.isEmpty()){
        System.out.print(" "+pq.poll());
      }
    }
}

public class comparatorclass implements Comparator<String>
{   
    public int compare(String s1, String s2){
        this.s1=s1;
        this.s2=s2;
        return(s1.compareTo(s2));
    }
}