class MyCode
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
    	 if(head==null)
    	 {
    	     return head;
    	 }
    	 if(x==1)
    	 {
    	    head=head.next;
            return head;
    	 }
    	 
    	 int i=0;
    	 Node curr=head;
    	 
    	 while(curr.next!=null)
    	 {
    	     x--;
    	     if(x==1)
    	     {
    	         curr.next=curr.next.next;
    	         break;
    	     }
    	     curr=curr.next;
    	 }
    	 return head;
    }
}
