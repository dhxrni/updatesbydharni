import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example24July1Map {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("k4", "v4");
        hm.put("k5", "v5");
        hm.put("k6", "v6");
        hm.put("k7", "v7");

        Set<Map.Entry<String, String>> s = hm.entrySet();

        System.out.println("Is this empty? " + hm.isEmpty());
        System.out.println("Display using iterator:");
        Iterator<Map.Entry<String, String>> itr = s.iterator();
        while(itr.hasNext()) {
            Map.Entry<String, String> me = itr.next();
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
