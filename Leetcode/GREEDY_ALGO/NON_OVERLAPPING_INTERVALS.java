//problem limilar to n-meetings in room,where we sorted the according to end time
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int i=0,c=1;
     
         Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int lastend=intervals[0][1];
        for(i=1;i<=n-1;i++)
        {
           if(lastend<=intervals[i][0])
           {
           c++;
           lastend=intervals[i][1];
        }
        }
        return n-c;
        
        
    }
}