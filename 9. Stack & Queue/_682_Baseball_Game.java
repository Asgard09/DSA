import java.util.Stack;

public class _682_Baseball_Game {
    public int calPoints(String[] operations) {
        Stack<Integer> myStack = new Stack<>();
        int result = 0;

        for(String c : operations){
            if(c.equals("C")){
                myStack.pop();
            }else if(c.equals("D")){
                myStack.push(myStack.peek()*2);
            }else if(c.equals("+")){
                int element = myStack.elementAt(myStack.size()-1) + myStack.elementAt(myStack.size()-2);
                myStack.push(element);
            }else{
                myStack.push(Integer.parseInt(c));
            }
        }

        for (Integer integer : myStack) {
            result += integer;
        }

        
        return result;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(myStack.peek()*2);

        System.out.println(myStack.peek());
    }
}
