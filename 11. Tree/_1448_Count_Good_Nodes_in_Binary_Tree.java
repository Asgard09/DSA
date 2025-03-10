public class _1448_Count_Good_Nodes_in_Binary_Tree {
    private int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    public void dfs(TreeNode root, int max){
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            max = root.val;
            count++;
        }

        dfs(root.left, max);
        dfs(root.right, max);
    }
}
