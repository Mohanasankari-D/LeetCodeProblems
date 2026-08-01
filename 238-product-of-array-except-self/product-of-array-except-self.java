class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int [nums.length];
        int count=0;
        int product=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
            else
            {
                product*=nums[i];
            }
        }
        System.out.println(product);
        for(int i=0;i<nums.length;i++)
        {
            if(count>1)
            {
                res[i]=0;
            }
        
            else if(count==1)
            {
               if(nums[i]==0)
                 {
                res[i]=product;
                 }
              else
                 {
                    res[i]=0;
                }
            }
            else
                {
                   res[i]=product/nums[i];
                }      
        }
        return res;
    }
}
 