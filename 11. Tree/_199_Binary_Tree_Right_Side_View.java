import java.util.ArrayList;
import java.util.List;

public class _199_Binary_Tree_Right_Side_View {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }

    public static void rightView(TreeNode root, List<Integer> res, int level){
        if (root == null) {
            return;
        }

        if (res.size() == level) {
            res.add(root.val);
        }

        rightView(root.right, res, level + 1);
        rightView(root.left, res, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        
        List<Integer> res = rightSideView(root);
        System.out.println(res.toString());
    }
}
