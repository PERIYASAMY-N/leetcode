class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        
    //    int min=Integer.MAX_VALUE;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++)
    //         {
    //           sum+=nums[j];
    //           if(sum>=target)
    //           {
    //                min=Math.min(min,(j-i)+1);
    //                break;
    //           }
              
    //         }
    //     }
    //     return min==Integer.MAX_VALUE?0:min;
    int l=0;
    int sum=0;
    int min=Integer.MAX_VALUE;
    for(int r=0;r<nums.length;r++)
    {
        sum+=nums[r];
        while(sum>=target)
        {
            min=Math.min(min,r-l+1);
            sum-=nums[l];
            l++;
        }
    
    }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}