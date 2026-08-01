class Solution {
    public int removeDuplicates(int[] nums) {
       int index=0;
       Arrays.sort(nums);
       int dup=nums[0]-1;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=dup)
           {
            nums[index++]=nums[i];
            dup=nums[i];
            }
       }
       return index;
    }
}