public class rggr {
    public static void main(String[] args) {
        try {
            System.out.println("Hello try 1");
            try {
                System.err.println("gello try 2");
            } catch (Exception e) {
                System.out.println("Hello catch 1");
            }
        } catch (Exception e) {
            System.out.println("Hello catch 2");
        } finally {
            System.out.println("Hello finally");
        }
    }
}