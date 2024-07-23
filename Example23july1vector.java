import java.Vector;
import java.util.List;
public class Example23july1vector {
    public static void main(String s[]){
        Vector <String> v= new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        System.out.println(v);
        List sl = v.subList(2);
        System.out.println(sl);

    }
}
