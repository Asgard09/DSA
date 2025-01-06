public class MyBST {
    private TreeNode root;

    public MyBST(){

    }

    public TreeNode insert(TreeNode root, int value){
        // TH1: root == null
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }else{
            TreeNode temp = root;
            while (true) {
                if (value > temp.val) {
                    temp = temp.right;
                }else{
                    temp = temp.left;
                }
            }
        }
        return null;
    }
}
