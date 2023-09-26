class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> mp1 = new HashMap<>();
        HashMap<String,Integer> mp2 = new HashMap<>();
        for(String st:words1)
        {
            if(mp1.containsKey(st)) 
               mp1.put(st,mp1.get(st)+1);
            else
               mp1.put(st,1);
        }
        for(String st:words2)
        {
            if(mp2.containsKey(st)) 
               mp2.put(st,mp2.get(st)+1);
            else
               mp2.put(st,1);
        }
        int numberOfWords=0;

        for(String st:mp1.keySet())
        {
           if(mp2.containsKey(st) && mp1.get(st)==1 && mp2.get(st)==1)
           {
               numberOfWords++;
           }
        }
      return numberOfWords;
    }
}
