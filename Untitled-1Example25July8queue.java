import java.util.*;
publi class Example25July8queue{
    public static void main(String[] args){
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(10);
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        Integer itr= pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    
        System.out.println("using offer");
        pq.offer(60);
        pq.offer(60);
        pq.offer(60);
        System.out.println("using offer"+pq);
        pq.offer(60);
        pq.offer(60);
        
        System.out.println("using offer"+pq);
        pq.offer(60);
        pq.offer(60);
        System.out.println("using offer"+pq);
        pq.offer(60);
        pq.offer(60);
        pq.offer(60);

        System.out.println("using offer"+pq);
            
    }}
