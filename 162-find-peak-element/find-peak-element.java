class Solution {
    public int findPeakElement(int[] nums) {int max=nums[0];int pos=0;
    if(nums.length==1)
{
    return pos;
}
        for (int i=1;i<nums.length;i++)
    {
        if(max<nums[i])
        {
            max=nums[i];
            pos=i;
        }
    
    } return pos;
}}