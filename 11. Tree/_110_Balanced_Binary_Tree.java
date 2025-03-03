public class _110_Balanced_Binary_Tree {

    public static boolean isBalanced(TreeNode root) {
        return calculateLength(root) != -1;
    }

    /*If statement used to consider left tree, right tree if not have 
      the program just consider root
     */
    public static int calculateLength(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateLength(root.left);

        //Consider left tree
        if (leftHeight == -1 ) {
            return -1;
        }
        int rightHeight = calculateLength(root.right);

        //Consider right tree
        if (rightHeight == -1 ) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);

        System.out.println(isBalanced(root));
    }
}
