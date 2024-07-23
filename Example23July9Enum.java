import java.util.EnumSet;

public class Example23July9Enum {
    enum enew {
        a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s
    }

    enum enew1 {
        w, x, y, z
    }

    public static void main(String[] args) {
        EnumSet<enew> e1 = EnumSet.of(enew.a, enew.b, enew.c);
        EnumSet<enew> e2 = EnumSet.copyOf(e1);
        EnumSet<enew> e3 = EnumSet.complementOf(e1);
        EnumSet<enew> e4 = EnumSet.noneOf(enew.class);
        
        e4.add(enew.d);  
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        e4.remove(enew.d);
        System.out.println(e4);
        
    }
}
