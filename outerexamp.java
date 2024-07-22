class outerexamp{
    class inner{
          void display(){
            System.out.println("hello inner");
        }
    }
    public staitc void main(String x[]){
        outerexamp o=new outerexamp();
        outerexamp.inner io=o.new inner();
        io.display();
    }
}