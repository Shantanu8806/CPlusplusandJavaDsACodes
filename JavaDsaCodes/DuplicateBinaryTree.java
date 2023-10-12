class Solution {
    private Set<String> subHashTrees = new HashSet<>();
    private boolean duplicateSubTreeFound = false;
    String func(Node root)
    {
        if(root==null)
        {
            return "";
        }
        String l=func(root.left);
        String r=func(root.right);
        
        String s=Integer.toString(root.data)+l+r;
        
        if(subHashTrees.contains(s) && s.length()>2)
            duplicateSubTreeFound=true;
        subHashTrees.add(s);
        return s;
    }
    int dupSub(Node root) {
        // code here 
        func(root);
        return duplicateSubTreeFound ? 1:0;
        
    }
}
