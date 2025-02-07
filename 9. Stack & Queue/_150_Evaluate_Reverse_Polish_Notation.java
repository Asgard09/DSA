import java.util.Stack;

public class _150_Evaluate_Reverse_Polish_Notation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> operandStack = new Stack<>();

        for (String token : tokens) {
            if (token.equals( "+")) {
                //How to get both firt elements in stack
                operandStack.push(operandStack.pop() + operandStack.pop());
            }else if (token.equals( "-")) {
                int first = operandStack.pop();
                int second = operandStack.pop();
                operandStack.push(second - first);
            }else if (token.equals( "*")) {
                operandStack.push(operandStack.pop() * operandStack.pop());
            }else if (token.equals( "/")) {
                int first = operandStack.pop();
                int second = operandStack.pop();
                operandStack.push(second / first);
            }else{
                operandStack.push(Integer.parseInt(token));
            }
        }

        return operandStack.peek();
    }

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        System.out.println(evalRPN(tokens));
    }
}
