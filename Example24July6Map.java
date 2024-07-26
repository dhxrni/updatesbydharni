import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example24July6Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(4, "d");
        
        Map<Integer, String> map = Collections.synchronizedMap(hm);
        
        synchronized (map) {
            Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<Integer, String> me = itr.next();
                System.out.println(me.getKey() + " " + me.getValue());
            }
        }
    }
}
