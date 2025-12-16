class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer>res=new Stack<>();
       int dummy[]=new int[10009];
       for(int i=nums2.length-1;i>=0;i--)
       {
           while(!res.isEmpty() && res.peek()<=nums2[i])
           {
            res.pop();
           }
           dummy[nums2[i]]=(res.isEmpty())?-1:res.peek();
           res.push(nums2[i]);

       }
       for(int i=0;i<nums1.length;i++)
       {

        nums1[i]=dummy[nums1[i]];
       }
        
       return nums1; 
    }
}