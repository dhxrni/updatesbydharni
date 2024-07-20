public class encapsulation {
    private int n;

    public void setN(int c) {
        n = c;
    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setN(2);
        System.out.println("   " + obj.getN());
    }
}
