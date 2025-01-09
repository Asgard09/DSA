public class MyBST {
    private TreeNode root;

    public MyBST(){

    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            }else{
                insertIntoBST(root.left, val);
            }
        }else{
            if (root.right == null) {
                root.right = new TreeNode(val);
            }else{
                insertIntoBST(root.right, val);
            }
        }
        return root;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(val < root.val){
            return searchBST(root.left, val);
        }else if(val > root.val){
            return searchBST(root.right, val);
        }else{
            return root;
        }
    }
}
