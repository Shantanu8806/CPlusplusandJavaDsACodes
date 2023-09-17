class Solution {
    public int getLucky(String s, int k) {
       int sum=0;
       for(int i=0;i<s.length();i++)
       {
           sum+=sumOfDigits(s.charAt(i)-'a'+1);
       }
       k-=1;
       while(k-->0)
       {
           sum=sumOfDigits(sum);
       }
      return sum;
    }
    private int sumOfDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
