
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ecample25July11comp {
    public static void main(String[] args) {


       SortedSet <student> ss = new TreeSet<>(new owncomp());
       ss.add(new student( 1, 100));
       ss.add(new student( 2, 200));

    }
}





public class student{
String s;
int r;
student(String s,int r)
{
    this.s=s;
    this.r=r;
}
@Override
public string toString(){
    return s+" "+r ;
}
public String getS() {
    return s;
}
public void setS(String s) {
    this.s = s;
}
public int getR() {
    return r;
}
public void setR(int r) {
    this.r = r;
}




}




public class owncomp implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        int id1 = o1.getR();
        int id2 =  o2.getR();
        return Integer.compare(id2, id2);
    }

     

    
}