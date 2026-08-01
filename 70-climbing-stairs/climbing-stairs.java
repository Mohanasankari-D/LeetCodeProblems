class Solution {
    public int climbStairs(int n) {
        int f1=0,f2=1, fn=0;
        if(n<4)
        {
            return n;
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                fn=f1+f2;
                f1=f2;
                f2=fn;
            }
        }
        return fn;
    }
}
