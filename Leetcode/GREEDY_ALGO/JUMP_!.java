class Solution {
    public boolean canJump(int[] nums) {
        
        int mi=0;
        for(int i=0;i<nums.length;i++)
        {
             if(i>mi)
            return false;

            if(i+nums[i]>mi)
            {
            mi=i+nums[i];
            //System.out.println(mi);
            }

           
        }
        return true;
    }
}