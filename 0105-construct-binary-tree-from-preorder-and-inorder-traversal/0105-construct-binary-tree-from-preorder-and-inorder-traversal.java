/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    private Map<Integer, Integer> inorderMap;
    private int preIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        preIndex = 0;

        // Store inorder values with their indices for O(1) lookup
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        // Root from preorder
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        // Find root index in inorder
        int inIndex = inorderMap.get(rootVal);

        // Build left and right subtrees
        root.left = build(preorder, inStart, inIndex - 1);
        root.right = build(preorder, inIndex + 1, inEnd);

        return root;
    }
}
