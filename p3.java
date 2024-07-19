public class p3 {
    public static class CustomException extends Exception {
        public CustomException(String s) {
            super(s);
        }
    }

    void func1() throws CustomException {
        func2();
    }

    void func2() {
        try {
            throw new CustomException("gjgghg v");
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        p3 obj = new p3();
        try {
            obj.func1();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
