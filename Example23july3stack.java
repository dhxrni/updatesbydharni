import java.util.Stack;

public class Example23july3stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        st.push("E");
        System.out.println(st);
        st.push("E");
        System.out.println(st);
        st.pop();
        for (String a : st) {
            System.out.println(a);
        }
    }
}
