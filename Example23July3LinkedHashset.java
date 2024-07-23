import java.util.LinkedHashSet;

public class Example23July3LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("E");
        lhs.add("F");
        System.out.println(lhs);
        lhs.remove("C");
        System.out.println(lhs);
    }
}
