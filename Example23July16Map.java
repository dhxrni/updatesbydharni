import java.util.HashMap;
import java.util.Map;

public class Example23July16Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Rahul");
        hm.put(2, "Rahul");
        hm.put(3, "Rahul");
        hm.put(4, "Rahugerverl");
        hm.put(5, "Rahurgbhrgreal");

         for(Map.Enter<Integer, String> ent : hm.enterySet()){
            System.out.println(ent.getKey() + " " + ent.getValue());
         }
//remove
         hm.remove(2);
         System.out.println("the new size is"+hm.size());
         for(Map.Enter<Integer,String> entt: hm.enterySet()){
            System.out.println(entt.getKey() + " " + entt.getValue());
         }
         
    }
}
