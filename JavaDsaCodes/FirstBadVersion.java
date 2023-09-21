ublic class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=1;
        int ans=0;
        while(s<=n)
        {
            int mid= s+(n-s)/2;
            if(isBadVersion(mid)==true)
            {
               ans=mid;
               n=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
      return ans;
    }
}
