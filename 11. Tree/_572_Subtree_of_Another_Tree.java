public class _572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) return false;

        /*Case 1: root and subroot have same length */
        if (isIdentical(root, subRoot)) return true;

        /*Case 2: subroot is a descendant of root */
        return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null) return true;

        if (root == null || subRoot == null || root.val != subRoot.val) return false;

        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }
}
