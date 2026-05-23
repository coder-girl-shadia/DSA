package Leetcode.GREEDY_ALGO;

import java.util.Arrays;

public class ASSIGN_COOKIES {
    class Solution {
    public int findContentChildren(int[] g, int[] s) {
            int count=0;
           int l=0,r=0;
           Arrays.sort(g);
           Arrays.sort(s);
           while(l<s.length && r<g.length)
           {
            if(s[l]>=g[r])
            {
                count++;
                r++;
            }
            l++;
           }
        return count;
        
    }
}
    
}
