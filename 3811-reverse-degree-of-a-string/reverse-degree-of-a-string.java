class Solution {
    public int reverseDegree(String s) {
        int t=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int v='z'-c+1;
            int p=i+1;
            t=t+(v*p);
        }
        return t;
    }
}