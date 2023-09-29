class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max=-1;
        for(int it:arr)
            if(hm.containsKey(it))
                hm.put(it,hm.get(it)+1);
            else
                hm.put(it,1);
        for(Map.Entry<Integer,Integer> entry:hm.entrySet())
            if(entry.getKey()==entry.getValue())
                max=Math.max(max,entry.getValue());
      return max;
    }
}
