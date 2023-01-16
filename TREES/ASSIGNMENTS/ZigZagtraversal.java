class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return res;
        int lvl=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                l.add(q.poll().val);
            }
            if(lvl%2==1)
                Collections.reverse(l);
            res.add(l);
            lvl++;
                
        }
        return res;
    }
}
