class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int x=num;
        for(int i=0;i<t;i++)
        {
            num+=2;
            x--;
        }
        return num;
    }
}