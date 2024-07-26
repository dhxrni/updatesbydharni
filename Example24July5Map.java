import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Example24July5Map{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Rahul");
        hm.put(2,"Rahul");
        hm.put(3,"Rahul");
        hm.put(4,"Rahul");

        //for
        for(Map.Entery<Integer,String> me: hm.enterySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }

        //while
         Iterator<Map.Entery<Integer,String>> itr= hm.enterySet().iterator();
         while(itr.hasNext()){
                Map.Entery<Integer,String> me2: (Map.Entery) itr.next();
                System.out.println(me2.getKey()+" "+me2.getValue());


         }
}