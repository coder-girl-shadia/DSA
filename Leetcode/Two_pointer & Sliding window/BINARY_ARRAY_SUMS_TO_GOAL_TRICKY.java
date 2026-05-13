class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       
      

      return func(nums,goal)-func(nums,goal-1);

    }
    /*findingSum(nums, 2) counts all subarrays where sum is 0, 1, or 2

      findingSum(nums, 1) counts all subarrays where sum is 0 or 1*/

    public int func(int[] nums,int goal)
    {
        int l=0,r=0,s=0,c=0;
        if(goal<0)
        return 0;
      while(r<nums.length)
      {
           s=s+nums[r];
           while(s>goal)
           {
            s=s-nums[l];
            l++;
           }
           c=c+(r-l)+1;  
           r++;
      }

       return c;

    }
}