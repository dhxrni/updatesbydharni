import java.util.HashSet;
import java.util.Set;

public class example22julyset3 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        System.out.println(s);
        s.remove("d");
        System.out.println(s);
        for (String x : s) {
            System.out.println(x);
        }
    }
}