class Solution {
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void convertToWave(int n, int[] a) {
        // code here
        int i=0;
        int j=i+1;
        
        while(i<n && j<n)
        {
            if(j<n)
            {
                swap(a,i,j);
            }
            i+=2;
            j=i+1;
        }
    }
}
