public class example22july3{
    public class innerexample{
        void disp(){
            System.out.println("inner class");
        }

    }
    public staitc void main(String x[]){
        example22july3.innerexample obj=new example22july3().new innerexample();
        new example22july3().new innerexample.disp();
    }
}