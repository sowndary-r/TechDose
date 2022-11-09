//TC:
   //Binary tree:
    //Insertion - O(N)
   //Traversal - O(N)

import java.util.*;
public class Main
{
    static class Node{  //creating node of the tree
        int val;
        Node left,right;
        Node(int value)
        {
            val=value;
            left=null;
            right=null;
        }
    }
    void insert(Node root,int value)
    {
       if(value<root.val)  //if value is less than the root value, insert the value left to the root
       {
           if(root.left!=null)  //if the left child of root is not null, reursive call
           insert(root.left,value);
           else
           root.left=new Node(value);
       }
       else if(value>root.val) //if value is greater than the root value, insert the value right to the root
       {
           if(root.right!=null) //if the right child of root is not null, reursive call
           insert(root.right,value);
           else
           root.right=new Node(value); 
       }
       else //if the value is equal to the root value, insert the value right to the root.
       root.right=new Node(value);
    }
   static void inorderTraverse(Node root)  //Left-->Root-->Right
    {
        if(root!=null)
        {
            
        inorderTraverse(root.left);
        System.out.print(root.val+" ");
        inorderTraverse(root.right);
        }
        
    }
    static void preorderTraverse(Node root) //Root-->Left-->Right
    {
        if(root!=null)
        {
        System.out.print(root.val+" ");   
        inorderTraverse(root.left);
        inorderTraverse(root.right);
        }
        
    }
    static void postorderTraverse(Node root) //Left-->Right-->Root
    {
        if(root!=null)
        {
        inorderTraverse(root.left);
        inorderTraverse(root.right);
        System.out.print(root.val+" ");   
        }
        
    }
    static void levelorderTraverse(Node node) //prints all the nodes at particular level
    {
        Queue<Node> q = new LinkedList<>();
        if(node==null)
        return;
        Node curr=node;
        q.add(curr); //add root node inside the queue
        while(!q.isEmpty()) //iterate until queue becomes empty
        { 
          curr=q.poll(); //remove and store the front node
          System.out.print(curr.val+" "); //print the visited node
          if(curr.left!=null) 
          q.add(curr.left); //enqueue the leftchild of the node if exists
          if(curr.right!=null)
          q.add(curr.right); //enqueue the rightchild of the node is exists
        }
    }
	public static void main(String[] args) {
	    Node root=new Node(5);
	    Main tree=new Main();
	    tree.insert(root,2);
	    tree.insert(root,4);
	    tree.insert(root,8);
	    tree.insert(root,6);
	    tree.insert(root,7);
	    tree.insert(root,3);
	    tree.insert(root,9);
	    
		System.out.println("INORDER TRAVERSAL");
		inorderTraverse(root);
		System.out.println();
		System.out.println("PREORDER TRAVERSAL");
		preorderTraverse(root);
		System.out.println();
		System.out.println("POSTORDER TRAVERSAL");
		postorderTraverse(root);
		System.out.println();
		System.out.println("LEVELORDER TRAVERSAL");
	        levelorderTraverse(root);
	}
}
