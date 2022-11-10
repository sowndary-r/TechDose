class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left,root.right);
    }
    static boolean helper(TreeNode l,TreeNode r)
    {
       if(l==null&&r==null)
       return true;
       if(l==null||r==null)
       return false;
       if(l.val!=r.val)
       return false;
       return helper(l.left,r.right)&&helper(l.right,r.left);
    }
}
