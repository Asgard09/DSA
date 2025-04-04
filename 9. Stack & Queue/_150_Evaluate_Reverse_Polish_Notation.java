import java.util.Stack;

public class _150_Evaluate_Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                myStack.push(calculate(myStack.pop(), myStack.pop(), token));
            }else{
                myStack.push(Integer.parseInt(token));
            }
        } 

        return myStack.peek();
    }

    public static int calculate(int a, int b, String operator){
        if(operator.equals("+")) return b + a;
        else if(operator.equals("-")) return b - a;
        else if(operator.equals("*")) return b * a;
        else if(operator.equals("/")) return b / a;
        return 0;
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}
