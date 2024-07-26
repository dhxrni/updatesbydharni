
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ecample25July10comp {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>(new MyComparator());
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}