import java.util.*;

public class Example22JulySet2 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        s.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}));
        
        // Check if the set contains the number 2
        boolean has = s.contains(2);
        
        // Print the result
        System.out.println(has);
    }
}