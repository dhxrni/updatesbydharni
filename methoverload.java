public class MethOverload {
    public static void main(String[] args) {
        One o = new One();
        o.demo(5);
        o.demo(5, 4);
        int aa;
        aa = o.demo(9.9);
        System.out.println(aa);
    }
}

class One {
    void demo(int x) {
        System.out.println("demo int");
    }

    void demo(int x, int y) {
        System.out.println("demo int int");
    }

    int demo(double x) {
        System.out.println("demo double");
        return (int) x;  
    }
}
