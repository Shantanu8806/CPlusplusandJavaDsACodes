class Solution {
    public int getDecimalValue(ListNode head) {
        String sol="";
        while(head!=null)
        {
            sol+=head.val;
            head=head.next;
        }
        int ans= Integer.parseInt(sol,2);
      return ans;
    }
}
