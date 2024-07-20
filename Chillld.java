class Parent {
    public void fun() {
        System.out.println("fun() of parent");
    }
}

public class Child extends Parent {
    public void fun() {
        System.out.println("fun of child");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
    }
}
