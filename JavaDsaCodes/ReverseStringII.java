class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n-1;i+=2*k)
            if(i+k-1<=n-1)
                reverse(i,i+k-1,ch);
            else
                reverse(i,n-1,ch);
        return new String(ch);
    }
    private static void reverse(int i,int j,char[] str)
    {
        while(i<j)
        {
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
}
