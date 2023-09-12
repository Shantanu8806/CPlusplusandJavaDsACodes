class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        char ch[]=s.toCharArray();

        for(Character c:ch)
        {
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        
        int minDeletions=0;
        for(int i=24;i>=0;i--)
        {
            if(freq[i]==0)
            {
                break;
            }
            if(freq[i]>=freq[i+1])
            {
                int prev=freq[i];
                freq[i]= Math.max(0,freq[i+1]-1);
                minDeletions += prev - freq[i];
            }
        }
      return minDeletions;
    }
}
