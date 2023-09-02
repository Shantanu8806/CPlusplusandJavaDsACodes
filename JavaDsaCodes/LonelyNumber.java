class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer>ans=new ArrayList<Integer>();
        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else
            {
                mp.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
           if(mp.get(nums[i])==1 && !mp.containsKey(nums[i]+1) && !mp.containsKey(nums[i]-1)) 
           {
              ans.add(nums[i]); 
           }
        }
        return ans;
    }
}
