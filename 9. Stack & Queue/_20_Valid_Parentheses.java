import java.util.Stack;

/*Push close brackets in to stack */
public class _20_Valid_Parentheses {

    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                charStack.push(')');
            }else if(c == '['){
                charStack.push(']');
            }else if (c == '{') {
                charStack.push('}');
            }else if (charStack.isEmpty() ||charStack.pop() != c) {
                return false;
            }
        }

        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[(])";
        System.out.println(isValid(s));
    }
}