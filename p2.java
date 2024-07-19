public class p2 {
 public static void main(String[] args) {
     
    try {
        System.out.println("try1");
        int n=5/0;
        System.out.println("n");
    } catch (Exception e) {
        System.out.println("catch1");
    } finally{
        System.out.println("finally1");
        }
 }   
}
