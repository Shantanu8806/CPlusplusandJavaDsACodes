class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<groupSizes.length;i++)
        {
            int size=groupSizes[i];
            hm.putIfAbsent(size,new ArrayList<>());
            hm.get(size).add(i);

            if(hm.get(size).size()==size)
            {
                ans.add(new ArrayList<>(hm.get(size)));
                hm.get(size).clear();
            }

        }
        
       return ans;
    }
}
