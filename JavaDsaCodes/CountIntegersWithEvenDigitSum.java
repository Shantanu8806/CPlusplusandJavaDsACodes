class Solution {
    private int digitSum(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
      return sum;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num; i++)
        {
            if(i<10)
            {
               if(i%2==0)
               {
                   count++;
               }
            }
            else
            {
                if(digitSum(i)%2==0)
                {
                    count++;
                }
            }

        }
      return count;
    }
}
