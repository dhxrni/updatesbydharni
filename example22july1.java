//staitc inner example 
public class example22july1 {
    public static void main(String[] args) {
        example o1=new example(); 
        example.innerexample obj=new innerexample();
        obj.display();
        System.out.println("staitc member x");
    }
}
class example{
    
static  class innerexample{
        
    void disp(){
        System.out.println("inner class");
    }
}
}