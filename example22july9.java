abstract class shape{
    abstract void area();
}
public class example22july9{
    public static void main(String[] args){
        shape s1=new shape(){
            @Override void area(){
                System.out.println("area of shape is 0");
            }
        };
        s1.area();
    }
}