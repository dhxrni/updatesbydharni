import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class example22JulyList2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("aa");
        al.add("aaa");
        al.add("aaaa");
        
        // Correctly create a synchronized list
        List<String> sal = Collections.synchronizedList(al);
        
        // Print the synchronized list
        System.out.println(sal);
    }
}