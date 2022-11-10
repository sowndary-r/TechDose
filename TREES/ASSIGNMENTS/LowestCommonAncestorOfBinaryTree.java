//TC:O(N)
//SC:O(N)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q) //if p or q is found,stop traversing and return root.
            return root; 
         TreeNode left=lowestCommonAncestor(root.left,p,q); //left recursion
         TreeNode right=lowestCommonAncestor(root.right,p,q); //right recursion
         if(right!=null && left!=null) //if both left & right are not null, then the root is the ancestor of both values thus return root
         return root;
         return left!=null?left:right; //if left is null,return right & right is null,return left.
