class Solution {
    void merge(int[] arr,int s,int e)
    {
        int mid=s+(e-s)/2;

        int mainArrayIndex=s;
        int len1=mid-s+1;
        int len2=e-mid;

        int[] left=new int[len1];
        int[] right=new int[len2];

        for (int i = 0; i < len1; i++)
        {
            left[i]=arr[mainArrayIndex++];
        }
        mainArrayIndex=mid+1;

        for (int i = 0; i < len2; i++)
        {
            right[i]=arr[mainArrayIndex++];
        }
        
        int index1=0;
        int index2=0;
        mainArrayIndex=s;
        while(index1<len1 && index2<len2)
        {
            if (left[index1]<right[index2])
            {
                arr[mainArrayIndex++]=left[index1++];
            }
            else
            {
                arr[mainArrayIndex++]=right[index2++];
            }
        }
        while (index1<len1)
        {
            arr[mainArrayIndex++]=left[index1++];
        }
        while (index2<len2)
        {
            arr[mainArrayIndex++]=right[index2++];
        }
    }
    void mergeSort(int arr[],int s, int e)
    {
        if (s >= e)
        {
            return;
        }
        int mid=s+(e-s)/2;

        //Sort left part
        mergeSort(arr,s,mid);

        //Sort right part 
        mergeSort(arr,mid+1,e);

        //merge the sorted arrays
        merge(arr,s,e);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
      return nums;
    }
}
