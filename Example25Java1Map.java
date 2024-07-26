public class Example25Java1Map {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm= new LinkedHashMap<Integer,String>();
        lhm.put(1,"a");
        lhm.put(2,"b");
        lhm.put(3,"c");
        lhm.put(4,"d");
        lhm.put(5,"e");  

        Set s= hlm.enterySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Map.Enter me= (Map.Enter)itr.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }


    }
}
