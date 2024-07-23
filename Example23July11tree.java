import java.util.TreeSet;

public class Example23July11tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(100);
        ts.add(200);
        ts.add(300);
        ts.add(400);
        ts.add(500);
        
        int v = ts.ceiling(15);
        System.out.println("ceiling value is " + v);
        
        int v1 = ts.floor(15);
        System.out.println("floor value is " + v1);
        
        TreeSet<Integer> sub = (TreeSet<Integer>) ts.subSet(50, 300);
        System.out.println("Subset from 50 to 300: " + sub);
        System.out.println("first element of sub is"+sub.first());
        System.out.println("tree contains 2"+ts.contains(2));
        
    
    
    }
}
