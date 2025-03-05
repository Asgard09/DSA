public class _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int smaller = Math.min(p.val, q.val);
        int bigger = Math.max(p.val, q.val);

        if (root.val >= smaller && root.val <= bigger) {
            return root;
        }
        else if(root.val > bigger) {
            /*The return is essential to pass the found LCA back to the previous function calls. */
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < smaller){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        myBST.root = myBST.insertIntoBST(myBST.root, 6);
        myBST.root = myBST.insertIntoBST(myBST.root, 2);
        myBST.root = myBST.insertIntoBST(myBST.root, 8);
        myBST.root = myBST.insertIntoBST(myBST.root, 0);
        myBST.root = myBST.insertIntoBST(myBST.root, 4);
        myBST.root = myBST.insertIntoBST(myBST.root, 7);
        myBST.root = myBST.insertIntoBST(myBST.root, 9);
        myBST.root = myBST.insertIntoBST(myBST.root, 3);
        myBST.root = myBST.insertIntoBST(myBST.root, 5);
        
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        lowestCommonAncestor(myBST.root, p, q);
    }
}
