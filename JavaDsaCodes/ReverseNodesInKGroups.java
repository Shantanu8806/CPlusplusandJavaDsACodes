class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
        {
            return null;
        }
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        int count=0;

        ListNode temp=head;
        int remainingNodes=0;

        while(temp!=null)
        {
            temp=temp.next;
            remainingNodes++;
        }
        if(remainingNodes<k)
        {
            return head;
        }
        else
        {
              while(curr!=null && count<k)
                {
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    count++;
                }

                if(next!=null)
                {
                    head.next=reverseKGroup(next,k);
                }
                return prev;
        }
    }
}
