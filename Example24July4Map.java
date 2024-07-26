import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example24July4Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        
        hm.put(6, "Rahul");
        hm.put(3, "Rahul");
        hm.put(4, "Amit");
        hm.put(5, "Vijay");
        hm.put(1, "Amit");
        hm.put(2, "Vijay");
        
        System.out.println("The original map is " + hm);

        Map<Integer, String> tm = new TreeMap<>();
        tm.putAll(hm);
        System.out.println("The sorted map is " + tm);
    }
}
