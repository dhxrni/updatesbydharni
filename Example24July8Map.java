
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Example24July8Map {
    public static void main(String[] args) {
        
        HashMap<Intrger,String> hm= new HashMap<Integer,String>();
        hm.put(1,"Amit");       
        hm.put(2,"Vijay");
        hm.put(3,"Rahul");
        hm.put(4,"Amit");
        hm.put(5,"Vijay");

        try {
            FileOutputStream fos= new FileOutputStream("Example24July8Map_hashmap.ser");
            ObjectOutputStream oos= mew ObjectOutputStream(fos);
            oos.writeObject(hm);
            oos.close();
            fos.close();
            System.out.println("serialization");
        } catch (e) {
            
            System.out.println("nope"+e);
        }

    }
}
