
import java.util.LinkedHashSet;

public class Example24July11Map {
    public static void main(String[] args) {
        LinkedHashSet <String> lls= new LinkedHashSet<String>();
        lls.add("A");
        lls.add("Aa");
        lls.add("Aaa");
        lls.add("Aaaa");
        lls.add("Aaaaa");
        LinkedHashSet <String> lls1= new LinkedHashSet<String>();
        lls.add("aA");
        lls.add("aAa");
        lls.add("aAaa");
        lls.add("aAaaa");
        lls.add("aAaaaa");
        
        
        System.out.println("first one");
        System.out.println(lls);
        
        System.out.println("second");
        
        System.out.println(lls);
        
        System.out.println(lls.equals(lls1));
    }
}
