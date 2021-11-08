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
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left ==0 || right ==0){ // Painful edge case: the tree might be skewed, so one part of the tre4e might be completely null. We need to traverse through the other part and find that depth
            return Math.max(left+1,right+1);
        }
        return Math.min(left+1,right+1);
    }
}
