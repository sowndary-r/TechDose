class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;//if root is null return false(because the pathsum is not equal to target)
        if(root.left==null&&root.right==null&&root.val==targetSum)//if root.left&&root.right&&root.val==currTargetValue(return true)
        {
            return true;
        }
         return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);//anyone one case is true means return true
      
    }
}
Footer
© 2022 GitH
