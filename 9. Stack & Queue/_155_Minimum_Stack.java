import java.util.ArrayList;
import java.util.List;

public class _155_Minimum_Stack {
    public static List<Integer> st;
    public static List<Integer> minSt;

    /*Arrays List is an implements of List */
    public _155_Minimum_Stack() {
        st = new ArrayList<>();
        minSt = new ArrayList<>();
    }
    
    public void push(int val) {
        st.add(val);
        if (minSt.isEmpty()) {
            minSt.add(val);
        }else{
            minSt.add(Math.min(val, minSt.get(minSt.size()-1)));
        }
    }
    
    public void pop() {
        st.remove(st.size()-1);
        minSt.remove(st.size()-1);
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public int getMin() {
        return minSt.get(minSt.size()-1);
    }

    public static void main(String[] args) {
        _155_Minimum_Stack minStack = new _155_Minimum_Stack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
