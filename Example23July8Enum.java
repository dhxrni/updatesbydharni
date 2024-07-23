import java.util.EnumSet;

enum NewEnum { q, w, e, r, t, y, u, i, o, p }

public class Example23July8Enum {
    public static void main(String[] args) {
        EnumSet<NewEnum> e1 = EnumSet.allOf(NewEnum.class);
        EnumSet<NewEnum> e2 = EnumSet.of(NewEnum.q, NewEnum.e, NewEnum.t, NewEnum.o);
        EnumSet<NewEnum> e3 = EnumSet.copyOf(e2);
        EnumSet<NewEnum> e4 = EnumSet.noneOf(NewEnum.class);
        EnumSet<NewEnum> e5 = EnumSet.range(NewEnum.y, NewEnum.p);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);
    }
}
