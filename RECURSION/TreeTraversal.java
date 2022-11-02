import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    static Node head = null;
    public static void insertBST(int val){
        if(head==null){
            head=new Node(val);
        }
        else{
            add(head,val);
        }
    }
    public static void add(Node root,int val){
        if(root.data>val){
            if(root.left==null){
                root.left=new Node(val);
                return ;
            }
            add(root.left,val);
        }
        else{
            if(root.right==null){
                root.right=new Node(val);
                return ;
            }
            add(root.right,val);
        }
    }
    public static void preOrder(){
        preOrderTraversal(head);
    }
    public static void preOrderTraversal(Node root){   //preorder traversal
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void postOrder(){
        postOrderTraversal(head);
    }
    public static void postOrderTraversal(Node root){  //postorder traversal
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(){
        inOrderTraversal(head);
    }
    public static void inOrderTraversal(Node root){ //inorder traversal
        if(root==null){
            return ;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
}
public class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       BST bst = new BST();
       int n = scanner.nextInt();
       for(int i=0;i<n;i++){
           int data = scanner.nextInt();  //inserting elements in BST
           bst.insertBST(data);
       }
       System.out.println("Postorder");
       bst.postOrder();
       System.out.println("\nPreorder");
       bst.preOrder();
       System.out.println("\nInorder");
       bst.inOrder();
    }
}
