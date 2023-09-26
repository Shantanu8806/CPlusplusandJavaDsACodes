class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm= new HashMap<>();
        String[] arr1= s1.split(" ");
        for(String s:arr1)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.get(s)+1);
            }
            else
            {
                hm.put(s,1);
            }
        }
        String[] arr2= s2.split(" ");
        for(String s:arr2)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.get(s)+1);
            }
            else
            {
                hm.put(s,1);
            }
        }
        List<String> list = new ArrayList<>();

        for(String st:hm.keySet())
        {
            if(hm.get(st)==1)
            {
                list.add(st);
            }
        }
        String[] result = new String[list.size()];

        for(int j=0;j<list.size();j++)
        {
            result[j]=list.get(j);
        }
      return result;
    }
}
