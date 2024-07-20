 
class Animal {
    void eat() {
        System.out.println("parent");
    }
} 
class Dog extends Animal {
    void bark() {
        System.out.println("child");
    }
} 
public class inheritance {
    public static void main(String[] args) {
         Dog dog = new Dog();

         dog.bark();

         dog.eat();
    }
}
