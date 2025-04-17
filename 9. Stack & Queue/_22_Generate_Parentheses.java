import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _22_Generate_Parentheses {
    List<String> res = new ArrayList<>();
    Stack<String> myStack = new Stack<>();

    public List<String> generateParenthesis(int n) {
        backtracking(0, 0, n);
        return res;
    }

    public void backtracking(int openN, int closeN, int n){
        if(openN == n && closeN == n){
            String joined = String.join("", myStack);
            res.add(joined);
        }
        if(openN < n){
            myStack.push("(");
            backtracking(openN+1, closeN, n);
            myStack.pop();
        }
        if(closeN < openN){
            myStack.push(")");
            backtracking(openN, closeN+1, n);
            myStack.pop();
        }
    }


}
