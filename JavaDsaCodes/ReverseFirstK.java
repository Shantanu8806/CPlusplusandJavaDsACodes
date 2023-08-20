class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer>st=new Stack<Integer>();
        int n=q.size();
        int i=0;
        while(i<k)
        {
            int el=q.peek();
            q.remove();
            st.push(el);
            i++;
        }
        while(!st.isEmpty())
        {
            int el=st.peek();
            st.pop();
            q.add(el);
        }
        int remaining=n-k;
        while(remaining>0)
        {
          int el=q.peek();
          q.remove();
          q.add(el);
          remaining--;
        }
        return q;
    }
}
