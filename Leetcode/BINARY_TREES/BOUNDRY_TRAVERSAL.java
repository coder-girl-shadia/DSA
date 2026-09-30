/**
 * Definition for a binary tree root.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
 
 boolean isLeaf(TreeNode root)
 {
    return root.left==null && root.right==null;
 }
 
 addLeft(TreeNode root,List<Integers>res)
 {
    TreeNode curr=root.left;
    while(curr!=null)
    {
        if(isLeaf(curr)==false)
        res.add(curr.data);
        if(curr.left!=null)
        curr=curr.left;
        else
        curr=curr.right;
    }
    return;


 }

 addRight(TreeNode root,List<Integers>res)
 {
     Stack<Integer> temp = new Stack<>();
    TreeNode curr=root.right;
    while(curr!=null)
    {
        if(isLeaf(curr)==false)
        temp.push(curr.data);
        if(curr.right!=null)
        curr=curr.right;
        else
        curr=curr.left;
    }
    while(!temp.isEmpty())
    res.add(temp.pop());
    
     return;
 }
 void addLeaves(TreeNode root,List<Integers>res)
 {
   if(isLeaf(root))
   res.add(root);
   return;
   if(root.left!=null)
   addLeaves(root.left,res);
    if(root.right!=null)
    addLeaves(root.right,res);

 }

    public List<Integer> boundary(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        addLeft(root,res);
        addLeaves(root,res);
          addRight(root,res);  
          return res;  
            
            }
}