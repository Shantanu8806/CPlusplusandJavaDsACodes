class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
           return true;
        if((p==null && q!=null) || (p!=null && q==null))
            return false;
        if(p.val!=q.val)
            return false;
        boolean rightSubTree=isSameTree(p.right,q.right);
        boolean leftSubTree= isSameTree(p.left,q.left);
       return rightSubTree && leftSubTree;
    }
}
