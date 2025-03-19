import java.util.HashMap;
import java.util.Map;

public class _106_Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    private static Map<Integer, Integer> mapping = new HashMap<>();
    private static int postorderIndex;

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i = 0; i<inorder.length; i++){
            mapping.put(inorder[i], i);
        }
        postorderIndex = postorder.length - 1;
        return build(postorder, 0, inorder.length - 1);
    }

    public static TreeNode build(int[] postorder, int start, int end){
        if (start > end) {
            return null;
        }

        int rootVal = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootVal);
        int mid = mapping.get(rootVal);

        /*If we build the left subtree first, we would pick elements incorrectly 
         *because postorder stores right children before left children 
        */
        root.right = build(postorder, start, mid-1);
        root.left = build(postorder, mid+1, end);

        return root;
        
    }

    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        buildTree(inorder, postorder);
    }
}
