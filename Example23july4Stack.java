import java.util.Stack;

public class Example23July4Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(4);
        st.push(4);
        System.out.println(st);
        st.pop();
        System.out.println("popped: " + st.pop());
        System.out.println(st);
        System.out.println(st.peek() + " is topmost element");
        System.out.println(st.search(3) + " is location of 3");
        System.out.println(st.empty() + " is it empty?");
    }
}
