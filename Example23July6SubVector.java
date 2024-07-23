import java.util.List;
import java.util.Stack;

public class Example23July6SubVector {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        
        List<Integer> sub = st.subList(4, 7);
        System.out.println(sub);
    }
}
