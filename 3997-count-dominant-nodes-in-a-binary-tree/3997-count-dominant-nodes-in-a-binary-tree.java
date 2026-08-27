class Solution {
    private int count = 0;

    public int countDominantNodes(TreeNode root) {
        helper(root);
        return count;
    }

    private int helper(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;

        int leftMax = helper(node.left);
        int rightMax = helper(node.right);

        int subMax = Math.max(leftMax, rightMax);

        if (node.val >= subMax) count++;

        return Math.max(node.val, subMax);
    }
}
