import java.util.HashMap;

public class Example24July3Map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 1);
        hm.put(2, 2);
        hm.put(3, 3);
        hm.put(4, 4);
        hm.put(5, 5);
        
        System.out.println("Hash map: " + hm);
        
         int r1 = hm.remove(1);
        System.out.println("Hash map after removing 1: " + hm);
        
        hm.clear();
        System.out.println("Hash map after clearing: " + hm);
    }
}
