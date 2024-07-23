import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example23July10tree {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        System.out.println("hash set is " + hs);

        Set<String> ts = new TreeSet<>(hs);
        for (String x : ts) {
            System.out.println(x);
        }
    }
}
