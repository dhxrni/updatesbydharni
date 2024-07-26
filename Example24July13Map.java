
import java.util.AbstractCollection;

public class Example24July13Map{
    public static void main(String[] args) {

        AbstractCollection<Integer> abs = new AbstractCollection<Integer>();
        abs.add(1);
        abs.add(2);
        abs.add(3);
        AbstractCollection<Integer> abs1 = new AbstractCollection<Integer>();
        abs1.add(1);
        abs1.add(2);
        System.out.println(abs.containsAll(abs1));
    }
}