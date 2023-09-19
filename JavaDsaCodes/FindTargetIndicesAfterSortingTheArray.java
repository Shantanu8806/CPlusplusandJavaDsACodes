class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        int ansl=-1;

        while(s<=e)
        {
           int mid=s+(e-s)/2;
           if(nums[mid]==target)
           {
               ansl=mid;
               e=mid-1;
           }
           else if(nums[mid]>target)
           {
               e=mid-1;
           }
           else
           {
               s=mid+1;
           }
        }
        s=0;
        e=nums.length-1;
        int ansr=-1;
        while(s<=e)
        {
           int mid=s+(e-s)/2;
           if(nums[mid]==target)
           {
               ansr=mid;
               s=mid+1;
           }
           else if(nums[mid]>target)
           {
               e=mid-1;
           }
           else
           {
               s=mid+1;
           }
        }

        if(ansl==-1)
        {
            return ans;
        }
        for(int i=ansl;i<=ansr;i++)
        {
            ans.add(i);
        }
        
      return ans;
    }
}
