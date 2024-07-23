import java.util.*;

public class Example23July5Vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("e");

        ArrayList<String> c = new ArrayList<>();
        c.add(" Q");
        c.add(" W");
        c.add(" E");
        c.add(" R");
        c.add(" T");
        c.add(" Y");

        System.out.println("vector is " + v);
        System.out.println("collection is " + c);

        v.addAll(c);
        System.out.println("New vector is " + v);
    }
}
