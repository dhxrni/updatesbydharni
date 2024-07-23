import java.util.Collections;
import java.util.Vector;

public class Example23July2Vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        v.add("c");
        v.add("c");
        v.add("c");
        v.add("c");
        int f = v.indexOf("c");
        int l = v.lastIndexOf("c");
        System.out.println(f);
        System.out.println(v);

        Vector<String> v1 = new Vector<>();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");

        System.out.println(v1);
        Collections.copy(v, v1);
        System.out.println(v1);
    }
}
