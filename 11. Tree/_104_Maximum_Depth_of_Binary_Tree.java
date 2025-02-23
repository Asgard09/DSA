public class _104_Maximum_Depth_of_Binary_Tree {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.root = myBST.insertIntoBST(myBST.root, 4);
        myBST.root = myBST.insertIntoBST(myBST.root, 2);
        myBST.root = myBST.insertIntoBST(myBST.root, 7);
        myBST.root = myBST.insertIntoBST(myBST.root, 1);
        myBST.root = myBST.insertIntoBST(myBST.root, 3);
        myBST.root = myBST.insertIntoBST(myBST.root, 6);

        System.out.println(maxDepth(myBST.root));
    }
}
