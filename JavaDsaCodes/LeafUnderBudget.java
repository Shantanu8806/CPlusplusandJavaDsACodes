class Solution{
    ArrayList<Integer>al;
    void vis_nodes(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        level++;
        if(node.left==null && node.right==null)
        {
            al.add(level);
            return;
        }
        vis_nodes(node.left,level);
        vis_nodes(node.right,level);
        
    }
    public int getCount(Node node, int bud)
    {
        //code here
        int cnt=0;
        al=new ArrayList<Integer>();
        vis_nodes(node,0);
        Collections.sort(al);
        
        for(int i=0;i<al.size();i++)
        {
            if(bud-al.get(i)>=0)
            {
                cnt++;
                bud-=al.get(i);
            }
            else
            {
                return cnt;
            }
        }
        return cnt;
    }
}
