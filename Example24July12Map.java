import java.util.AbstractCollection;

public class Example24July12Map {
    public static void main(String[] args) {
        AbstractCollection<Integer> ab= new AbstractCollection<Integer>();
        ab.add(1);
        ab.add(2);
        ab.add(3);
        AbstractCollection<Integer> ab1= new AbstractCollection<Integer>();
       ab1.addAll(ab);
       

    }
}
