class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer>st=new Stack<Integer>();
        
        while(!q.isEmpty())
        {
            int el=q.peek();
            st.push(el);
            q.remove();
        }
        
        while(!st.isEmpty())
        {
            int el=st.peek();
            q.add(el);
            st.pop();
        }
        
        return q;
    }
}
