import java.util.Arrays;
import java.util.Stack;

public class _853_Car_Fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][speed.length];
        Stack<Double> myStack = new Stack<>();

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        //Sort the cars by position
        Arrays.sort(cars, (a,b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < cars[0].length; i++) {
            //Calculate time of each car
            double time = (double)(target - cars[i][0])/cars[i][1];
            if (myStack.isEmpty() || time > myStack.peek()) {
                myStack.push(time);
            }
        }

        return myStack.size();
    }  
    
    public static void main(String[] args) {
        int[] position = {6,8};
        int[] speed = {3,2};
        int target = 10;
        System.out.println(carFleet(target, position, speed));
    }
}
