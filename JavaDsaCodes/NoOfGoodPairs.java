class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int it:nums)
            if(!hm.containsKey(it))
                hm.put(it,1);
            else
                hm.put(it,hm.get(it)+1);
        int noOfPairs=0;
        boolean[] vis = new boolean[101];
        for(int it:nums)
            if(!vis[it])
            {
                int count=hm.get(it);
                noOfPairs += (count*(count-1))/2;
                vis[it]=true;
            }
      return noOfPairs;
    }
}
