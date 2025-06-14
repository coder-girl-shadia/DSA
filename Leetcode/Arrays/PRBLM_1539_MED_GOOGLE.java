class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            k++;
            else
            break;



        }
        ans=k;
        return ans;

    }



        
}