public class neww {
    public static void main(String[] args) {
        m1();
        m2();
        try {
            m3(); // This will throw a RuntimeException
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException in main: " + e.getMessage());
        }
        m4();
    }

    public static void m1() {
        System.out.println("Executing m1");
    }

    public static void m2() {
        System.out.println("Executing m2");
    }

    public static void m3() {
        System.out.println("Executing m3");
        // This will cause a RuntimeException
        throw new RuntimeException("Error in m3");
    }

    public static void m4() {
        System.out.println("Executing m4");
    }
}
