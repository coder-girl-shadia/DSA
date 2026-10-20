/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public void parent_mark(TreeNode root,HashMap<TreeNode,TreeNode>parent_q){ 
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr.left!=null){
             parent_q.put(curr.left,curr);
             q.offer(curr.left);}
              if(curr.right!=null){
             parent_q.put(curr.right,curr);
             q.offer(curr.right);}
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        HashMap<TreeNode,TreeNode>parent_q=new HashMap<>();
        parent_mark(root,parent_q);
         Queue<TreeNode>q=new LinkedList<>();
          HashMap<TreeNode,Boolean>visited=new HashMap<>();
          q.offer(target);
          visited.put(target,true);
          int d=0;
          while(!q.isEmpty())
          { 
            int size=q.size();
            if(d==k)
            break;
            d++;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null && visited.get(curr.left)==null)
                {
                    q.offer(curr.left);
                    visited.put(curr.left,true);
                }
                 if(curr.right!=null && visited.get(curr.right)==null)
                {
                    q.offer(curr.right);
                    visited.put(curr.right,true);
                }
                 if(parent_q.get(curr)!=null && visited.get(parent_q.get(curr))==null)
                {
                    q.offer(parent_q.get(curr));
                    visited.put(parent_q.get(curr),true);
                }
            }
            
          }
      List<Integer>l=new ArrayList<>();
      while(!q.isEmpty())
      {
        l.add(q.poll().val);
      }
      return l;
    }
}