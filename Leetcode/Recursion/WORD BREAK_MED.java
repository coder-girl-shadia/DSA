class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {
          return solve(0,s,wordDict);

         
     
    }
    public boolean solve(int idx,String s,List<String> wordDict)
    {

        if(idx==s.length())
        return true; //jb i end reach hua ,,itka mtlb saare words break hokr mil chuka hai dictionary mai
          if(wordDict.contains(s))
          return true;
       
       for(int i=idx+1;i<=s.length();i++)
       {
          String ns=s.substring(idx,i);
          if(wordDict.contains(ns) && solve(i,s,wordDict))
              return true;
          
       }
        return false;



    }
}