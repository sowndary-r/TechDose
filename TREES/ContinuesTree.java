//To check whether the given tree is continues tree or not.
//TC : O(N)
public class Main
{
    static class Node{
        int val;
        Node right,left;
        Node(int value)
        {
         val=value;
         left=right=null;
        }
    }
    static boolean continueTree(Node root)
    {
     if(root==null)  //if root is null,return true.
     return true;
     if(root.left==null&&root.right==null) //if the node is leafnode,return true.
     return true;
     if(root.left==null) //if there is no leftchild,only check for right child.
     return (Math.abs(root.val-root.right.val)==1)&&continueTree(root.right);
     if(root.right==null) //if there is no rightchild,only check for rightchild.
     return (Math.abs(root.val-root.left.val)==1)&&continueTree(root.left); 
     //if both childs are present,check for both , first left recursive call and then right recursive call.
     return (Math.abs(root.val-root.left.val)==1)&&(Math.abs(root.val-root.right.val)==1)&&continueTree(root.left)&&continueTree(root.right);
     
    }
	public static void main(String[] args) {
	
		Main tree=new Main();
		Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(5);
    	System.out.println(continueTree(root));
	} 
}
