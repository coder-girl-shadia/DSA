class Solution {
    public int romanToInt(String s) {
        s=s+" ";
        int sum=0;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<String,Integer>map2=new HashMap<>();
        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);
        map2.put("IV",4);
        map2.put("IX",9);
        map2.put("XL",40);
        map2.put("XC",90);
        map2.put("CD",400);
        map2.put("CM",900);
        for(int i=0;i<s.length()-1;i++)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            String tc=""+c1+c2;
             if(map2.containsKey(tc))
             {
             sum=sum+map2.get(tc);
             i=i+1;
             }
             else
             sum=sum+map1.get(c1);

        }
        return sum;

    }
}