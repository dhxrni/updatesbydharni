public class example22july11 {
    public static void main(String[] args) {
        String s = new String("hello"); // Corrected syntax for String
        s = s.concat("world"); // Assign the result of concat to s

        StringBuilder sb = new StringBuilder("HELLO"); // Use StringBuilder type
        sb.append("WORLD");

        System.out.println(s); // Prints "helloworld"
        System.out.println(sb); // Prints "HELLOWORLD"
    }
}
