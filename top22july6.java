public class top22july6{
    int x=1;
    class inner{
        inr x=2;
        public void d(){
            int x=3;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(top22july6.this.x);
        }

    }
    psvm
    {
        new top22july6().new inner().d();
    }
}