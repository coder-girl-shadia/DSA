class Solution {
    public void getFloorAndCeil() {
int nums[] = {3,4,4,7,8,10};
int x=5;
int d1=x-nums[0],d2=x-nums[0],k=0,n=0;
for(int i=0;i<nums.length;i++)
{
  if(nums[i]<=x && (x-nums[i])<d1)
  {
    d1=x-nums[i];
    k=i;
  }
  
  if(nums[i]>=x && (nums[i]-x)<=d2)
  {
    d2=x-nums[i];
    n=i;
  }
}
if(k!=0 || n!=0)
System.out.println(nums[k]+"\t"+nums[n]);
else
System.out.println(-1+"\t"+-1);
 }
 public static void main(String args[]){
     Solution obj = new Solution();
     obj.getFloorAndCeil();
 }
}

