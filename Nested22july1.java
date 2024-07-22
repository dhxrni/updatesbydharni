class outer{
    class inner{
        void display(){
            System.out.println("inner class");
                        }
}
    void display2(){
        System.out.println("OUTER    class 2");
    }

}

class Nested22july1{
    public static void main(String[] args) {
        outer o=new outer();
        o.display2();
        outer.inner o1= new outer().new inner();
        o1.display();

    }
}