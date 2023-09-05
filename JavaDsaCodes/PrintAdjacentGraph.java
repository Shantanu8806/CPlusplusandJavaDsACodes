class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        int n=edges.length;
        int m=edges[0].length;
        
        for(int i=0;i<V;i++)
        {
            List<Integer>list=new ArrayList<Integer>();
            ans.add(list);
        }
        
        for(int i=0;i<n;i++)
        {
                if(!ans.get(edges[i][0]).contains(edges[i][1]) && !ans.get(edges[i][1]).contains(edges[i][0]))
                {
                    ans.get(edges[i][0]).add(edges[i][1]);
                    ans.get(edges[i][1]).add(edges[i][0]);
                }
            
        }
        return ans;
    }
}
