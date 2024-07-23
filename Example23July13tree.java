import java.util.TreeSet;

public class Example23July13tree {
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
         System.out.println("orignal ts is");
         for(int x:ts){
            System.out.println(x);
         }
         int yy= ts1.pollFirst();
         System.out.println("element "+yy);
         System.out.println("after poll first ts is");
         for(int x:ts){
            System.out.println(x);
         }
            int yy1= ts1.pollLast();
         System.out.println("element "+yy1);
         System.out.println("after poll first ts is");
         for(int x:ts){
            System.out.println(x);
            ts1.remove(5);
            System.out.println(ts1);
            
         }
    }

