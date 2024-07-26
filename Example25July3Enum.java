import java.util.*;
enum e1{
a,b,c,d,e;
}
public class Example25July3Enum{
public static void main(String[] args){
Collection<e1> ce1= new ArrayList<>();
ce1.add(e1.a);
ce1.add(e1.b);
ce1.add(e1.c);
System.out.println("collection"+ce1);
EnumSet<e1> e2=EnumSet.copyOf(ce1);
System.out.println("enumset"+e2);
e2= EnumSet.of(e1.d);
System.out.println("enumset"+e2);
}