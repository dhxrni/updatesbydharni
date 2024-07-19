public class f {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("try"+a);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}