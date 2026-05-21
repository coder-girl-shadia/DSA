class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,mf=0,ml=0,chances=0;
       int hash[]=new int[26];
        while(r<s.length())
        {
               hash[s.charAt(r)-'A']++; //freq of character
               mf=Math.max(mf, hash[s.charAt(r)-'A']);
              
               while((r-l+1)-mf>k)              //slide the window
               {
                  hash[s.charAt(l)-'A']--;
                  mf=0;
                  for(int i=0;i<26;i++)
                  mf=Math.max(mf,hash[i]);
                  l++;
               }
                 if((r-l+1)-mf<=k)
                 ml=Math.max(ml,r-l+1);
                 r++;

        }
        return ml;
    
    }
}