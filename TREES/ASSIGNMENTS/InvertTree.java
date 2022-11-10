//TC:O(N)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return root;
        TreeNode temp=root.right; //swapping left refernce and right reference
        root.right=root.left; 
        root.left=temp;
        invertTree(root.left); //left recursive call
        invertTree(root.right); //right recursive call
        return root;
    }
}
