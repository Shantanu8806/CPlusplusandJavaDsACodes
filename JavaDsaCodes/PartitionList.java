class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy= new ListNode(0);
        ListNode lessTail=lessDummy;

        ListNode greaterDummy=new ListNode(0);
        ListNode greaterTail=greaterDummy;

        ListNode curr=head;

        while(curr!=null)
        {
            if(curr.val<x)
            {
                lessTail.next=curr;
                lessTail=curr;
            }
            else
            {
                greaterTail.next=curr;
                greaterTail=curr;
            }
            curr=curr.next;
        }
        greaterTail.next=null;
        lessTail.next=greaterDummy.next;

        return lessDummy.next;
    }
}
