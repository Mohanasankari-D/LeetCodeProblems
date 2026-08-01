class Solution {
    public boolean isAnagram(String s, String t) {
        int fre[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            fre[c-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            fre[c-'a']--;
        }
        for(int var : fre)
        {
            if(var!=0)
            {
                return false;
            }
        }
        return true;
    }
}