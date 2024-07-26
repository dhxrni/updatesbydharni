import java.util.*;
public class Example26July3sortedset {
public static void main(String[] args) {
    SortedSet<String> ts= new TreeSet<String>();
    ts.add("A");
    ts.add("B");
    ts.add("C");
    ts.add("D");
    ts.add("E");
    System.out.println("contains x or not ?"+ts.contains("x"));
    System.out.println("contains a or not ?"+ts.contains("a"));

    System.out.println("first"+ts.first());
    System.out.println("removing last "+ts.remove(ts.last()));
    System.out.println("enteire set is ");
    for(String a:ts){
        System.out.println(a);
    }

}    
}
