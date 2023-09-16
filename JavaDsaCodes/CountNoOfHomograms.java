class Solution {
    private int mod=1000000007;
    public int countHomogenous(String s) {
        int count=1;
        int n=s.length();
        int ans=s.length();

        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                ans=(ans+count)%mod;
                count++;
            }
            else
            {
                count=1;
            }
        }
      return ans;   
    }
}
