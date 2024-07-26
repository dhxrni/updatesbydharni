
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Example25July4queuejava {
public static void main(String[] args) {
    Queue<String> que= new LinkedList<String>();
    Collection<Strig> col= new Collection<String>() ;  
    col.add("a");
    col.add("b");
    col.add("c");
    col.add("d");
    col.add("e");
    que.addAll(col);
    System.out.println(que);
    System.out.println(que.peek()+"peek");
    System.out.println(que.poll()+"poll");
    System.out.println(que.element()+"element- head ");
    que.offer("new ");
    System.out.println(que+"new queue");
    System.out.println(que.size()+"size");
    System.out.println(que.remove()+"remove");
    
    
}
