/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)
        {
           head=head.next;
        }

        ListNode temp=head;
        if(temp==null)
        {
            return temp;
        }
        while(temp.next!=null)
        {
            if(temp.next !=null && temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
      return head;
    }
}
