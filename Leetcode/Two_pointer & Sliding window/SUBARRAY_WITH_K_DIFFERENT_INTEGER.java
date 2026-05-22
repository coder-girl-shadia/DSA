import java.util.HashMap;
import java.util.Map;

public class SUBARRAY_WITH_K_DIFFERENT_INTEGER {
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {


        return func(nums,k)-func(nums,k-1);   //<=k - <k
        
    }
    public static int func(int[] nums,int k)
    {
        int l=0,r=0,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<nums.length)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l])==0)
                map.remove(nums[l]);
                l++;
                

            }
            count=count+((r-l)+1);
            r++;
           
        }
         return count;
    }
}
}
