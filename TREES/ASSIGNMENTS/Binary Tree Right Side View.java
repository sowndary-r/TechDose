class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List arr=new ArrayList<>();
        right(arr,root,0);
        return arr;
    }
    public void right(List<Integer> arr,TreeNode root,int level){
        if(root==null) return;
        if(arr.size()<=level){
            arr.add(level,root.val);
        }else{
            arr.set(level,root.val);
        }
        right(arr,root.left,level+1);
        right(arr,root.right,level+1);
    }
}
