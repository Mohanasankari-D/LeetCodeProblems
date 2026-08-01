import java.util.*;
class Solution
 {
    public void moveZeroes(int[] nums)
     {
        int index=0;
        for (int i=0;i<nums.length;i++)
        {
         if(nums[i]!=0)
                {
                    nums[index++]=nums[i];
                    
                }
        }    
            for(int k=index;k<nums.length;k++)
            {
                nums[k]=0;
            }
            System.out.print(Arrays.toString(nums));
     }
}