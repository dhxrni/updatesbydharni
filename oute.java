public class outer{
    public class inner{
        public void display(){
            System.out.println("inner class");
    }
    void disp(){
        inner i=new inner();
        i.display();
    }
}
public class example22july2{
    public static void main(String[] args) {
        outer o=new outer();
        o.disp();
}