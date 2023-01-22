class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();//creating an hashmap
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);//adding key and values in the  hashMap
        }
        return BuildTree(preorder,0,preorder.length-1);//function call
    }
    public TreeNode BuildTree(int []preorder,int left,int right)
    {
        if(left>right)return null;//if left greater than right then return null
        int val=preorder[index++];//taking the value in the preorder
        TreeNode root=new TreeNode(val);//creating an node
        root.left=BuildTree(preorder,left,map.get(val)-1);//leftsubtree for inorder(o,indexOfVal-1);
        root.right=BuildTree(preorder,map.get(val)+1,right);//rightsubtree for inorder(indexOfVal+1);
        return root;
    }
}
