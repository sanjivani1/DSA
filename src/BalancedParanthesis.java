import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if(s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']'){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length() ; i++){
            if(s.charAt(i) == '}'){
                char c = st.peek();
                if(c == '{'){
                    st.pop();
                }
            }
            if(s.charAt(i) == ')'){
                char c = st.peek();
                if(c == '('){
                    st.pop();
                }
            }
            if(s.charAt(i) == ']'){
                char c = st.peek();
                if(c == '['){
                    st.pop();
                }
            }
            st.push(s.charAt(i));
        }
        return st.isEmpty();
    }
}
