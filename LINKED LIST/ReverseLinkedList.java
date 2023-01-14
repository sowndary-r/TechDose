public class Main
{
    
    static class Node{
       int data;
       Node next;
       Node(int d) //assigning values to the node
       {
           data=d;
           next=null;
       }
    }
    static Node head=null;
    static void insertAtBeginning(int data)
    {
        Node node=new Node(data);
        node.next=null;
        if(head==null)
        head=node;
        else
        {
            Node first=head;
            head=node;
            node.next=first;
        }
        
    }
    static void reverse()
    {
        Node curr=head;
        Node prev=null;
        Node next=curr.next;
        while(curr!=null)
        {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        head=prev;
    }
    static void display()
    {
        Node curr=head;
        if(head==null)
        System.out.println("list is empty");
        else{
            while(curr!=null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        }
    }
    
	public static void main(String[] args) {
	    Main list=new Main();
	    //insertAtBeginning
	   insertAtBeginning(40);
	   insertAtBeginning(30);
	   insertAtBeginning(20);
	   insertAtBeginning(10);
	   insertAtBeginning(5);
	   reverse();
	   display();
	   
	}
}
