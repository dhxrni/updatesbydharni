interface temp{
    void func();
    int x=1;
}
 
public class anonymousexample22july7 {
public static void main(String[] args) {
    temp o=new temp(){
        @Override public void func(){
            System.out.println("hello");    
        }
    };
    o.func();
}
    
}