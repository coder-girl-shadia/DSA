class Solution {
    public int[][] merge(int[][] intervals) {

      List<int[]>res=new ArrayList<>();
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

      int s=intervals[0][0];
      int e=intervals[0][1];
      int n=intervals.length;
      for(int i=0;i<n;i++)
      {
        if(e>=intervals[i][0])
        {
            e=Math.max(e,intervals[i][1]);
        }
        else
        {
            res.add(new int[]{s,e});
            s=intervals[i][0];
            e=intervals[i][1];

        }
      }
      res.add(new int[]{s,e});
      return res.toArray(new int[res.size()][]);

         
      }
        
    }
