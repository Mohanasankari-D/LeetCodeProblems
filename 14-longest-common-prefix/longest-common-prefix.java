class Solution {
    public String longestCommonPrefix(String[] s) {
        String a="";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length;i++)
        {
            if(min>s[i].length())
            {
                min=s[i].length();
            }
        }
        for(int i=0;i<min;i++)
        {
            char b=s[0].charAt(i);
            boolean ans=true;
            for(int j=1;j<s.length;j++)
            {
                if(b!=s[j].charAt(i))
                {
                    ans=false;
                }
            }
            if(ans) a+=b;
            else return a;
        }
        return a;
    }
}