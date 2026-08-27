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
    Queue<TreeNode> q=new LinkedList<>();
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
        return res;
        q.offer(root);
        boolean left_right=true;            //0->R to L
        while(!q.isEmpty())
        {
             int size=q.size();
             List<Integer> subl=new ArrayList<>();
             for(int i=0;i<size;i++)
             {
                  TreeNode node=q.poll();
                if(left_right)
                {
                    subl.add(node.val);
                
                }
                else
                 subl.add(0,node.val);
                    

                if(node.left!=null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);
           
             }
             res.add(subl);
             left_right=!left_right;
        
        }
        return res;
 
    }
}