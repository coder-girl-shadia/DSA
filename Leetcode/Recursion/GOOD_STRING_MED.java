class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        int e=5;
        int p=4;
        long ei=(n+1)/2;
        long oi=n/2;
        long resev=findevpow(e,ei);
        long resp=findppow(p,oi); 
        //System.out.println(resev+" "+resp);
        return (int)((resev%MOD*resp%MOD)%MOD);
    }
    long findevpow(int e,long ei)
    {
        if(ei==0)
        return 1;
       long half=findevpow(e,ei/2);
       long res=(half%MOD*half%MOD)%MOD;
        if(ei%2==0)
        return (res)%MOD;
        else
        return (res*e)%MOD;

    }
    long findppow(int p,long oi)
    {
        if(oi==0)
        return 1;
        long half=findppow(p,oi/2);
        long res=(half%MOD*half%MOD)%MOD;
        if(oi%2==0)
        return res%MOD;
        else
        return (res*p)%MOD;

    }
}