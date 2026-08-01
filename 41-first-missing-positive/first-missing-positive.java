class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k=1;int temp=nums[0]-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==temp||nums[i]<=0)
            
            {
                continue;
            }
            
            else
            {
                if(nums[i]==k)
                {
                    temp=nums[i];
                    k++;
                }
                else
                {
                    return k;
                }
            }
        }
        return k;
        
    }
}

