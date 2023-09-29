class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing =true, decreasing = true;
        for(int i=1;i<nums.length;i++)
           if(nums[i-1]<nums[i])
               decreasing=false;
           else if(nums[i-1]>nums[i])
              increasing=false;
        if(!increasing && !decreasing)
            return false;
      return true;
    }
}
