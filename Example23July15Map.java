import java.util.HashMap;
import java.util.Map;

public class Example23July15Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Rahul");
        hm.put(2, "Rahul");
        hm.put(3, "Rahul");
        hm.put(4, "Rahugerverl");
        hm.put(5, "Rahurgbhrgreal");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
