class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        List<List<String>> ans=new ArrayList<List<String>>();
        Map<String,List<String>>mp=new HashMap<String,List<String>>();
        
        for(String s:strs)
        {
            String temp=s;
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(mp.containsKey(st))
            {
                mp.get(st).add(temp);
            }
            else
            {
                List<String>list=new ArrayList<String>();
                list.add(temp);
                mp.put(st,list);
            }
        }
        for(Map.Entry<String,List<String>>it:mp.entrySet())
        {
            ans.add(it.getValue());
        }
       return ans;
    }
}
