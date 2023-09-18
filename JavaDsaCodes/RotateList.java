class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        int n=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            n++;
        }
        temp.next=head;
        k=k%(n+1);
        int jumps=n-k;
        temp=head;
        while(jumps>0)
        {
            temp=temp.next;
            jumps--;
        }
        ListNode newHead = temp.next;
        temp.next=null;
      

      return newHead;
    }
}
