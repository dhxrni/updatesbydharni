import java.util.Vector;

public class example22julylist4 {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        System.out.println(v.size());
        System.out.println(v.capacity());
        for(int i=0;i<50;i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("a");

        v.addElement('a');
        }
    }
