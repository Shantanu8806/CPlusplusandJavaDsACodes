class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int[] a=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[arr[i]]+=1;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>1)
            {
                ans.add(i);
            }
        }
        if(ans.isEmpty())
        {
            ans.add(-1);
        }
        
      return ans;
    }
}
