class A{
    void func(){
        System.out.println("I am a method");
    }
}

class B extends A{
    void func(){
        System.out.println("I am b method");
    }    public static void main(String x[]){
        B b= new A();
        b.func();
    }
}