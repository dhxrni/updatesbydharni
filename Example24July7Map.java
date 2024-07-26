
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example24July7Map{
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<Integer,String>();
        hm.put(1,"Rahul");
        hm.put(2,"Rahul");
        hm.put(3,"Rahul");
        hm.put(4,"Rahul");
        hm.put(5,"Rahul");

        Map m = Collections.synchronizedMap(hm);
        Set<E> set = m.entrySet();
       // //
       //     for(Object o : set){
       //         System.out.println(o);
       //     }
       // }
       synchronized(m){
        Iterator itr= set.iterator();
        while(itr.hasNext()){
        Map.Entery<Integer,String> me= (Map.Entry)itr.next();
        System.out.println(me.getKey()+" "+me.getValue());
        
        }



       }
    }
}