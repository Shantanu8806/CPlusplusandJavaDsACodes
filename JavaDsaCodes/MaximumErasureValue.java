class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start=0;
        int end=0;
        HashSet<Integer> hs = new HashSet<>();
        int sum=0,ans=0;
        while(end<nums.length)
        {
           while(start<end && hs.contains(nums[end]))
           {
               hs.remove(nums[start]);
               sum-=nums[start++];
           }
           hs.add(nums[end]);
           sum+=nums[end++];
           ans=Math.max(ans,sum);
        }
      return ans;
    }
}
