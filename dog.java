abstract class Animal { 
   public abstract void Sound();
}

class Dog extends Animal {
   public void Sound() {
       System.out.println("Woof");
   }

   public static void main(String args[]) {
       Animal obj = new Dog();
       obj.Sound();
   }
}
