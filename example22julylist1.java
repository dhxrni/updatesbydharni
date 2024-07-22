import java.util.ArrayList;

public class example22julylist1 {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("a");
        al.add(1);
        al.add(true);
        al.add(1.2);
        al.add(null);
        System.out.println(al);
        
        try {
            al.add(5, "a"); // Changing the index to a valid position
            System.out.println("okay: " + al);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}