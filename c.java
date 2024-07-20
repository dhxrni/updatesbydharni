class Parent {
    public void fun() {
        System.out.println("fun() of parent");
    }
}

public class C extends Parent {
    public void fun() {
        System.out.println("fun of child");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.fun();
    }
}
