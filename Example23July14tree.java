import java.util.TreeSet;

public class Example23July14tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        ts1.add(4);
        ts1.add(5);
        ts1.add(6);
        ts1.add(7);
        ts1.add(8);
        
        System.out.println("Original ts is:");
        for (int x : ts1) {
            System.out.println(x);
        }
        
        TreeSet<Integer> tail = (TreeSet<Integer>) ts1.tailSet(6);
        System.out.println("Tailset is:");
        for (int x : tail) {
            System.out.println(x);
        }
    }
}
