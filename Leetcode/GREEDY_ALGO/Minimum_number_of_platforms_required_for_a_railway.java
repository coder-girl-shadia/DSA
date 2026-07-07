class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int i=0,j=0,c=0,max_count=0;
        while(i<Arrival.length)
        {
            if(Arrival[i]<Departure[j])
            {
                i++;
                c++;
            }
            else
            {
                j++;
                c--;
            }
            max_count=Math.max(max_count,c);
        }
        return max_count;
    }
}