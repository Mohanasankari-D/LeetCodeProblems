class Solution {
    public int[] concatWithReverse(int[] nums) {
    int a=2*nums.length;
    int ans[]=new int[a];
    int index=0;
    for(int i=0;i<nums.length;i++)
    {
        ans[index]=nums[i];
        index++;
    }
    for(int i=nums.length-1;i>=0;i--)
    {
        ans[index]=nums[i];
        index++;
    }
    return ans;
    }
}