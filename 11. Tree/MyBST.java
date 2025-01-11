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

    public TreeNode deleteNode(TreeNode root, int key) {
        //search
        if(root == null ) {
            return null;
        }
        if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root.val>key) {
            root.left = deleteNode(root.left,key);
        }
        else{
            //case 1: leaf node
            if(root.left == null && root.right == null ) {
                return null;
            }
            //case 2 : one child
            if(root.left ==  null){
                return root.right;
            }
            else if(root.right ==  null ) {
                return root.left;
            }
            //case 3 : two children
            TreeNode IS = findInOrderSuccessor(root.right);
            root.val = IS.val;

            
            root.right = deleteNode(root.right,IS.val);
        }
        return root;

    }
    private TreeNode findInOrderSuccessor(TreeNode root){
        while(root.left != null){
            root = root.left;
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
