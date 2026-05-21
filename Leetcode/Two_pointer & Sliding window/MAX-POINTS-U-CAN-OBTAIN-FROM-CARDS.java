public class MAX-POINTS-U-CAN-OBTAIN-FROM-CARDS {
    
    class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int lsum=0,rsum=0,msum=0;
        
        for(int i=0;i<=k-1;i++)
        {
            lsum=lsum+cardPoints[i];
            msum=lsum;
        }
        int rindex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rindex];
            rindex--;
            msum=Math.max(msum,(lsum+rsum));

        }
        return msum;



    }
}
}
