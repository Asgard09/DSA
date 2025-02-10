import java.util.ArrayList;
import java.util.List;

public class _22_Generate_Parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    public static void backtrack(List<String> res, String curr, int open, int close, int max){
        //Base case
        if (curr.length() == max*2) {
            res.add(curr);
            return; 
        }

        if (open < max) {
            backtrack(res, curr + "(", open+1, close, max);
        }

        if (close<open) {
            backtrack(res, curr + ")", open, close+1, max);
        }
        
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}