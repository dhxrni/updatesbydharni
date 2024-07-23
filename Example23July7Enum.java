import java.util.EnumSet;

enum Color {
    RED,
    GREEN,
    BLUE,
    BLACK,
    WHITE,
    YELLOW,
    ORANGE,
}

public class Example23July7Enum {
    public static void main(String[] args) {
        EnumSet<Color> e1 = EnumSet.allOf(Color.class);
        EnumSet<Color> e2 = EnumSet.of(Color.BLACK, Color.RED);
        EnumSet<Color> e3 = EnumSet.noneOf(Color.class);
    }
}
