public class p4 {

    int op(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        p4 obj = new p4();

        try {
            int a = obj.op(5, 0);
            System.out.println("result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
