import java.util.HashMap;
import java.util.Map;

/*
 * The first element of the preorder array is always the root.
 * Locate this root in the inorder array.
 * The left subtree is formed by the elements before this root in inorder.
 * The right subtree is formed by the elements after this root in inorder.
 * Use recursion to build the left and right subtrees.
 */
public class _105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    private static int preorderIndex;
    private static Map<Integer, Integer> mapping;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        mapping = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mapping.put(inorder[i], i);
        }

        preorderIndex = 0;
        return build(preorder, 0, inorder.length - 1);        
    }

    private static TreeNode build(int[] preorder, int start, int end) {
        if (start > end) return null;

        /*Get root val through preorder */
        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);

        /*represents the index of the current root node in the inorder array*/
        int mid = mapping.get(rootVal);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}
