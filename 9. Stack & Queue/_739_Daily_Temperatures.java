import java.util.Stack;

public class _739_Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for(int i = 0; i<temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i]<temperatures[stack.peek()]) {
                int index = stack.pop();
                result[i] = i - index;
            }
            stack.push(i);
        }

        return result;  
    }  
    
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temperatures));
    }
}
