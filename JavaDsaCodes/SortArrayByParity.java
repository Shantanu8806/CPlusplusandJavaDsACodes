class Solution {
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
           while(i<j && nums[i]%2 ==0)
              i++;
           while(i<j && nums[j]%2 ==1)
              j--;
            swap(nums,i,j);
        }
      return nums;
    }
}
