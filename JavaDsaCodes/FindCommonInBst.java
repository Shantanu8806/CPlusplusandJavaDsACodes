class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        inOrder(root1,set);
        inOrder(root2,set,ans);
        return ans;
    }
    private static void inOrder(Node root,Set<Integer> set)
    {
        if(root==null)
            return;
        inOrder(root.left,set);
        set.add(root.data);
        inOrder(root.right,set);
    }
    private static void inOrder(Node root,Set<Integer>set,ArrayList<Integer> ans)
    {
        if(root==null)
            return;
        inOrder(root.left,set,ans);
        if(set.contains(root.data))
            ans.add(root.data);
        inOrder(root.right,set,ans);
    }
}
