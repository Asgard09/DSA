import java.util.ArrayList;
import java.util.List;

public class _102_Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversalLevel(root, 0, res);
        return res;

    }

    public void traversalLevel(TreeNode root, int level, List<List<Integer>> res){
        if (root == null) {
            return;
        }
        /*If this is the first time visiting this level, create a new list */
        if (res.size() == level) {
            List<Integer> added = new ArrayList<>();
            added.add(root.val);
            res.add(added);
        }
        /*Add the current node value to the existing level list */
        else{
            res.get(level).add(root.val);
        }

        traversalLevel(root.left, level+1, res);
        traversalLevel(root.right, level+1, res);

    }
}
