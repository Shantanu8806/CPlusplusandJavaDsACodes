class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> unique = new HashSet<>();

       for(int no:nums)
       {
           if(unique.contains(no))
              return true;
           unique.add(no);
       }
      return false;
    }
}
