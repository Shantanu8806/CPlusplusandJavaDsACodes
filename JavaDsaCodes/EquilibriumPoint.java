class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
        {
            return 1;
        }
        int totalSum=0;
        for(long i:arr)
        {
            totalSum+=i;
        }
        int before=0;
        int after=totalSum-(int)arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(before==after)
            {
                return i;
            }
            after-=arr[i];
            before+=arr[i-1];
        }
      return -1;
    }
}
