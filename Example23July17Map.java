import java.util.HashMap;
import java.util.Map;

public class Example23July17Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Rahul");
        hm.put(2, "Rahul");
        hm.put(3, "Rahul");
        hm.put(4, "Rahugerverl");
        hm.put(5, "Rahurgbhrgreal");

        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        hm.replace(2, "newrahul");

        for (Map.Entry<Integer, String> ent : hm.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }
    }
}
