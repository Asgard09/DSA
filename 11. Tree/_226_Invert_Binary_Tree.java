public class _226_Invert_Binary_Tree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }


    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.root = myBST.insertIntoBST(myBST.root, 4);
        myBST.root = myBST.insertIntoBST(myBST.root, 2);
        myBST.root = myBST.insertIntoBST(myBST.root, 7);
        myBST.root = myBST.insertIntoBST(myBST.root, 1);
        myBST.root = myBST.insertIntoBST(myBST.root, 3);
        myBST.root = myBST.insertIntoBST(myBST.root, 6);
        myBST.root = myBST.insertIntoBST(myBST.root, 9);

        System.out.println(MyBST.preorderTraversal(invertTree(myBST.root)));
    }

}
