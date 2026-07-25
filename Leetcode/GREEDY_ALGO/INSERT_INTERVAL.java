class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<List<Integer>> res = new ArrayList<>();
        int n=intervals.length;
        int i=0;
        while(i<n && intervals[i][1]<newInterval[0])
         {
            //res.add(intervals[i]);
            res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
         }
         while(i<n && intervals[i][0]<=newInterval[1])
         {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;

         }
         //res.add(newInterval);
         res.add(Arrays.asList(newInterval[0], newInterval[1]));
         while(i<n)
         {
            //res.add(intervals[i]);
            res.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            i++;

         }
         int[][] ans = new int[res.size()][2];

        for (int j = 0; j < res.size(); j++) {
            ans[j][0] = res.get(j).get(0);
            ans[j][1] = res.get(j).get(1);
        }
         return ans;

       




        
    }
}