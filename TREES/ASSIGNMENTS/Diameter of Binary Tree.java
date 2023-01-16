class Solution {
    static int height(TreeNode root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int dl=diameterOfBinaryTree(root.left);
        int dr=diameterOfBinaryTree(root.right);
        int cur=height(root.left) + height(root.right);
        return Math.max(cur, Math.max(dl, dr));
    }
}
