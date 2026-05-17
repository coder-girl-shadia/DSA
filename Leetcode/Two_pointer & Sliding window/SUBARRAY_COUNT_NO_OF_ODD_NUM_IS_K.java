class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    
       return func(nums,k)-func(nums,k-1);

    }
    /*findingSum(nums, 2) counts all subarrays where sum is 0, 1, or 2

      findingSum(nums, 1) counts all subarrays where sum is 0 or 1*/

    public int func(int[] nums,int k)
    {
        int l=0,r=0,s=0,c=0;
        if(k<0)
        return 0;
      while(r<nums.length)
      {
           s=s+(nums[r]%2);    //odd->1  even->0
           while(s>k)
           {
            s=s-(nums[l]%2);
            l++;
           }
           c=c+(r-l)+1;  
           r++;
      }

       return c;

    }

        
    
}
