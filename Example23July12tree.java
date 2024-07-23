import java.util.TreeSet;

public class Example23July12tree {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        ts1.add(4);
        ts1.add(5);
        ts1.add(6);
        ts1.add(7);
        ts1.add(8);
        
        ts2.add("a");
        ts2.add("b");
        ts2.add("c");
        ts2.add("d");
        ts2.add("e");
        ts2.add("f");
                
        System.out.println(ts1.lower(999));
        System.out.println(ts1.lower(6));
        System.out.println(ts2.lower("5"));

        TreeSet<Integer> ts3= new TreeSet<Integer>();
        ts3=(TreeSet)ts2.clone();
        System.out.println(ts3);
        //clone 

    }
}
