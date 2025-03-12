public class _98_Validate_Binary_Search_Tree {
    public static boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean valid(TreeNode root, long minimum, long maximum){
        if (root == null) {
            return true;
        }
        
        if (!(minimum < root.val && maximum > root.val)) {
            return false;
        }

        return valid(root.left, minimum, root.val)&&valid(root.right, root.val, maximum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(-1);
        System.out.println(isValidBST(root));
    }
    
}
