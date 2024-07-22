import java.util.LinkedList;

public class example22julylist3 {
    public static void main(String[] f) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        System.out.println(ll);
        ll.add(null);
        System.out.println(ll);
        ll.add("aaa");
        System.out.println(ll);
        ll.add('a');
        System.out.println(ll);
        ll.add(1);
        System.out.println(ll);
        ll.add(1);
        System.out.println(ll);
        ll.add(1);
        System.out.println(ll);
        ll.add(1);
        System.out.println(ll);
        ll.add(1);
        System.out.println(ll);
        ll.set(5, "b");
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.addFirst("aa");
        System.out.println(ll);
        ll.remove();

        System.out.println(ll);
    }
}