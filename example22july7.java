public class example22july7{
        public void display(){
            System.out.println("class");
            public class inner{ 
                System.out.println("inner ");

            }
        }
            inner o=new inner();
            public static void main(String f[]){
                new example22july7().display();
            }
}