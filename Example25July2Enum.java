
import java.util.EnumSet;


enum e{

a,
b,
c,
d,
e,
f
} 
    public class Example25July2Enum {
        public static void main(String[] args) {
            EnumSet<e> eset=null;
            eset=EnumSet.allOf(e.class);
            System.out.println("eset");


        }
}
