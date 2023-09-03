class Solution {
    int freq1[];
    int freq2[];
    public boolean isAnagram(String s, String t) {
        freq1=new int[26];
        freq2=new int[26];
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();

        for(int i=0;i<ch1.length;i++)
        {
            freq1[ch1[i]-'a']++;
        }
        for(int i=0;i<ch2.length;i++)
        {
            freq2[ch2[i]-'a']++;
        }

        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
        }
      return true;
    }
}
