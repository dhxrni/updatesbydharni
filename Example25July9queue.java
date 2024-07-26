import java.util.*;
publi class Example25July9queue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        Object []ar= pq.toArray();
        for(Object x : ar){
            System.out.println(x);
        }
         }
}