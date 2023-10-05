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
   
public TreeNode searchBST(TreeNode root, int val) {
    // If the root is null or we've found the target value at the root, return the root.
    if (root == null || root.val == val) {
        return root;
    }
    
    // If the target value is less than the current node's value, continue searching in the left subtree.
    if (val < root.val) {
        return searchBST(root.left, val);
    } 
    // If the target value is greater than the current node's value, continue searching in the right subtree.
    else {
        return searchBST(root.right, val);
    }
}

}