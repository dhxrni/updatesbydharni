import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class example22julyset4 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        System.out.println(s);
        s.remove("d");
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}