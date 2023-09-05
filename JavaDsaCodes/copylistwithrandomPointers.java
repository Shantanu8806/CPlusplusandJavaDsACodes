/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
        {
            return null;
        }
        HashMap<Node,Node> mp = new HashMap<>();
        Node newHead= new Node(head.val);
        mp.put(head,newHead);
        Node curr = head.next;
        Node x=newHead;
        //firstly clone the linked list without random pointers
        while(curr !=null)
        {
            Node newNode= new Node(curr.val);
            x.next=newNode;
            mp.put(curr,newNode);
            curr=curr.next;
            x=x.next;
        }
        //now set the random pointers

        Node it=head;
        Node it2=newHead;

        while(it!=null)
        {
            Node get=it.random;
            Node put=mp.get(get);
            it2.random=put;
            it=it.next;
            it2=it2.next;
        }
        return newHead;
    }
}
