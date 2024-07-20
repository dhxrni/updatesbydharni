public class overloading {
   public  void disp() {
        System.out.println("Hello World");
    }
    
    public int disp(int i) {
        System.out.println("Hello World");
        return i;
    }
    
    public String disp(String s) {
        System.out.println("Hello World");
        return s;
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.disp();
        obj.disp(5);
        obj.disp("hello");
    }
}
