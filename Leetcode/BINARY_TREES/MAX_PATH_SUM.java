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
    int pathsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
      calc(root);
      return pathsum;
        
        
    }
     public int calc(TreeNode root)
    {
    if(root==null)
    return 0;
    int ls=Math.max(0,calc(root.left));//to eliminate nagative path sum
    //pathsum=Math.max(pathsum,root.val+ls);
    int rs=Math.max(0,calc(root.right));
    //pathsum=Math.max(pathsum,root.val+rs);
    pathsum=Math.max(pathsum,root.val+ls+rs);
    return root.val+Math.max(ls,rs);
    }
}