public class _110_Balanced_Binary_Tree {

    public static boolean isBalanced(TreeNode root) {
        return calculateLength(root) != -1;
    }

    public static int calculateLength(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftHeight = calculateLength(root.left);
        if (leftHeight == -1 ) {
            return -1;
        }
        int rightHeight = calculateLength(root.right);
        if (rightHeight == -1 ) {
            return -1;
        }
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.root = myBST.insertIntoBST(myBST.root, 5);
        myBST.root = myBST.insertIntoBST(myBST.root, 6);
        myBST.root = myBST.insertIntoBST(myBST.root, 7);
        myBST.root = myBST.insertIntoBST(myBST.root, 8);
        myBST.root = myBST.insertIntoBST(myBST.root, 4);
        myBST.root = myBST.insertIntoBST(myBST.root, 3);
        myBST.root = myBST.insertIntoBST(myBST.root, 2);

        System.out.println(isBalanced(myBST.root));
    }
}
