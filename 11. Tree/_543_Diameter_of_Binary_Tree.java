/*
Use recursion to find:
    The longest path through the root (calculateLength(root.left) + calculateLength(root.right)).
    The diameter of the left subtree.
    The diameter of the right subtree.
Return the maximum of these three values.
 */
public class _543_Diameter_of_Binary_Tree {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateDepth(root);
        return diameter;
    }

    public int calculateDepth(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftDepth = calculateDepth(root.left);
        int rightDepth = calculateDepth(root.right);

        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the current node
        return 1 + Math.max(leftDepth, rightDepth);
    }
}
