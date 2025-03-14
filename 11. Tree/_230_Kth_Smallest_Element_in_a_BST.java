public class _230_Kth_Smallest_Element_in_a_BST {
    private static int result = 0;
    private static int count = 0;
    public static int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return result;
    }

    public static void inorder(TreeNode root){
        if (count == 0 || root == null) {
            return;
        }
        
        inorder(root.left);
        count--;
        if (count == 0) {
            result = root.val;
            return;
        }
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);

        System.out.println(kthSmallest(root, 1));
    }
}
