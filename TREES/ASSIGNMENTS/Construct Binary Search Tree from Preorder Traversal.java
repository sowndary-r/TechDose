class Solution {
    TreeNode root;
    public TreeNode bstFromPreorder(int[] pre) {
        root=new TreeNode(pre[0]);
        for(int i=1;i<pre.length;i++)
            insert(root,pre[i]);
        return root;
    }
    void insert(TreeNode r,int val)
    {
        if(val<r.val)
        {
            if(r.left!=null)
                insert(r.left,val);
            else
            r.left=new TreeNode(val);
        }
        else if(val>r.val)
        {
            if(r.right!=null)
                insert(r.right,val);
            else
                r.right=new TreeNode(val);
        }   
    }
