public class lkrugr {
    public static void main(String[] args) {
        int a=2,b=0;
    int r;
    
        try {
             r=a/b;
             System.err.println("res"+r);
        } catch (Exception e) {
            System.err.println("nah "+e.getMessage());
        }
    }
}
