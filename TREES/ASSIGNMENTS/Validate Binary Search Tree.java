 public boolean isValidBST(TreeNode root) {
        return in(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean in(TreeNode r,long min,long max)
    {
        if(r==null)return true;
        if(r.val>=max || r.val<=min)return false;
        return in(r.left,min,r.val) && in(r.right,r.val,max);
    }
}
