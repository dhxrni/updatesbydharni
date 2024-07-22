import java.util.*;
public class example22julyset1{
    public static void main(String[] args){
        Set<Integer> s=new HashSet<Integer>();
        s.addAll(Arrays.asList(new Integer [] {1,2,3,4,5,6,7,8}) );
        Set<Integer> ss=new HashSet<Integer>();
        ss.addAll(Arrays.asList(new Integer[]{9,8,7,6,5,4,3,2,1}));
        s.addAll(ss);
        System.out.println(s);
        
        

    
    }}