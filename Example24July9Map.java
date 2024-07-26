import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example24July9Map {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(1, "one");
        tm.put(2, "two");
        tm.put(3, "three");
        tm.put(4, "four");
        tm.put(5, "five");

        Set<Map.Entry<Integer, String>> s = tm.entrySet(); 
        Iterator<Map.Entry<Integer, String>> itr = s.iterator(); 
        while (itr.hasNext()) {
            Map.Entry<Integer, String> me = itr.next(); 
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
