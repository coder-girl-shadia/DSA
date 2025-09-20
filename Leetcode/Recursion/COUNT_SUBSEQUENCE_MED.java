class Solution {
   
    public int countSubsequenceWithTargetSum(int i,int s,int[] nums, int k) {
        
        if(i==nums.length)
        {
            if(s==k)
            return 1;
            else
            return 0;
        }
        s=s+nums[i];
        int l=countSubsequenceWithTargetSum(i+1,s,nums,k);
        s=s-nums[i];
        int r=countSubsequenceWithTargetSum(i+1,s,nums,k);
        return l+r;
    
        //your code goes here
    }
}