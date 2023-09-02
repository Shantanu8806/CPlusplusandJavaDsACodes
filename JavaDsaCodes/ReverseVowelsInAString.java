class Solution {
    private static boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
             return true;
        }

      return false;
    }
    public String reverseVowels(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int st=0;
        int e=n-1;
        while(st<e)
        {
            if(!isVowel(ch[st]))
            {
              st++;
            }
            else if(!isVowel(ch[e]))
            {
                e--;
            }
            else
            {
               char temp=ch[st];
               ch[st]=ch[e];
               ch[e]=temp;
               e--;
               st++; 
            }
        }
        String ans=new String(ch);
        return ans;
    }
}
