public class _100_Same_Tree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
    }


    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.root = myBST.insertIntoBST(myBST.root, 4);
        myBST.root = myBST.insertIntoBST(myBST.root, 2);
        myBST.root = myBST.insertIntoBST(myBST.root, 7);
        myBST.root = myBST.insertIntoBST(myBST.root, 1);
        myBST.root = myBST.insertIntoBST(myBST.root, 3);
        myBST.root = myBST.insertIntoBST(myBST.root, 6);

        MyBST myBST2 = new MyBST();
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 4);
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 2);
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 7);
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 1);
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 3);
        myBST2.root = myBST2.insertIntoBST(myBST2.root, 6);

        System.out.println(isSameTree(myBST.root, myBST2.root));
    }
}
