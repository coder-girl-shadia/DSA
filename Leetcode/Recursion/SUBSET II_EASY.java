class Solution {

List<List<Integer>>result=new ArrayList<>();
    public void findsum(int i,int arr[],List<Integer>ds)
    {
       
        
            result.add(new ArrayList<>(ds));//ads a copy of ds to result
          
      
      
        for(int k=i;k<arr.length;k++)
        {
            if(k>i&& arr[k]==arr[k-1])
            continue;
            ds.add(arr[k]);
            findsum(k+1,arr,ds);
             ds.remove(ds.size()-1);

        }
    }
        
      

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        findsum(0,nums,new ArrayList<>());
       
        return result;

    }
        
        
    
}