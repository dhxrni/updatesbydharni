public class overriding {
    public void fun(){
        System.out.println("fun() of parent");
    }
}
public class child extends overriding{
    public void fun(){
            System.err.println("fun of child ");
}
public static void main(String[] args) {
    overriding obj = new overriding();  
    obj.fun();  
}
}