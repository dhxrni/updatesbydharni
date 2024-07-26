
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example24July910Map {
    public static void main(String[] args) {
        Set<E> <String> lhs= new LinkedHashSet<String>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");

        Iterator itr= lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
