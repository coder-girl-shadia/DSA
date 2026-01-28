class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0,max_length=0;
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r)))
            {
                if(map.get(s.charAt(r))>=l)
                l=map.get(s.charAt(r))+1;
                map.put(s.charAt(r),r);
            }
            int length=r-l+1;
            max_length=Math.max(length,max_length);
            map.put(s.charAt(r),r);
            r++;


        }
        return max_length;
 
    }
}