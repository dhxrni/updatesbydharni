class animal{
    void sound(){
        System.out.println("animal sound");
    }
}
public class example22july8{
    public static void main(String[] args) {
        animal a= new animal(){
            @Override void sound(){
                System.out.println("new sound ");
            }
        };
        a.sound();
    }
}