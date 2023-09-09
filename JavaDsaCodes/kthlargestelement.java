class Solution {
    
    public static void inorder(Node node, ArrayList<Integer> list)
    {
        if (node == null) {
            return;
        }
 
        inorder(node.left, list);
        list.add(node.data);
        inorder(node.right, list);
    }
   
    public int kthLargest(Node root,int K)
    {
        //Your code here
        ArrayList<Integer> ans1 = new ArrayList<>();
        inorder(root, ans1);
        Collections.sort(ans1);
        return ans1.get(ans1.size()-K);
    }
}
