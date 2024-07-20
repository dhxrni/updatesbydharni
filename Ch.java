class Parent {
    public void fun() {
        System.out.println("fun() of parent");
    }
}

public class Ch extends Parent {
    public void fun() {
        System.out.println("fun of child");
    }

    public static void main(String[] args) {
        Ch obj = new Ch();
        obj.fun();
    }
}
