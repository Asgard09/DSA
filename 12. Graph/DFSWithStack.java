import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFSWithStack {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 1, 0, 0},
            {0, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 0, 0}
        };
        //Declare
        Stack<Integer> stack = new Stack<>();
        Set<Integer> browsed = new HashSet<>();

        //Initialize
        stack.add(0);
        browsed.add(0);

        //Browse by stack
        while (!stack.isEmpty()) {
            int u = stack.pop();
            // process u
            System.out.print(u + " ");
            // Add all adjacent peak v with u that not browsed in stack


            for(int v = 0; v<graph.length; v++){
                if (graph[u][v] == 1 && browsed.contains(v) == false) {
                    stack.add(v);
                    browsed.add(v);
                }
            }
        }
    }
}