class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int x:nums)
        {
            int it=Math.abs(x);
            if(nums[it-1]<0)
                ans.add(it);
            else
                nums[it-1]*=-1;
        }
      return ans;
    }
}
