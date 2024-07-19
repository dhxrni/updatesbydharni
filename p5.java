public class p5 {
    public static void main(String[] args) {
        p5 o = new p5();
        o.f();
        System.out.println("normal");
    }

    void f() {
        try {
            f2();
        } catch (ArithmeticException e) {
            System.out.println("catch: " + e.getMessage());
        }
    }

    void f2() {
        throw new ArithmeticException("exep");
    }
}
