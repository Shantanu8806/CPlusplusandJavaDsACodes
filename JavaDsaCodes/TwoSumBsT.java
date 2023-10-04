class Solution {
    public boolean findTarget(TreeNode root, int k) {
        return findPair(root,k,new HashSet<Integer>());
    }
    private boolean findPair(TreeNode root,int target,HashSet<Integer> set)
    {
        if(root==null)
        {
            return false;
        }

        if(set.contains(target-root.val))
        {
            return true;
        }

        set.add(root.val);

        return findPair(root.left,target,set) || findPair(root.right,target,set);
    }
}
