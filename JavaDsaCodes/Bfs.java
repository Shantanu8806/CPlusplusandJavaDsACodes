class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs= new ArrayList<Integer>();
        boolean vis[]=new boolean[V];
        Queue<Integer>q=new LinkedList<Integer>();
        vis[0]=true;
        q.add(0);
        
        while(!q.isEmpty())
        {
            Integer node = q.poll();
            bfs.add(node);
            for(int i=0;i<adj.get(node).size();i++)
            {
                if(vis[adj.get(node).get(i)]==false)
                {
                    vis[adj.get(node).get(i)]=true;
                    q.add(adj.get(node).get(i));
                }
            }
        }
        return bfs;
        
    }
}
