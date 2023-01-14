//singly linked list
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
    static void insertAtEnd(int data)
    {
        Node node=new Node(data);
        node.next=null;
        if(head==null)
        head=node;
        else{
            Node curr=head;
            while(curr.next!=null)
            curr=curr.next;
            curr.next=node;
        }
    }
    static void insertAtPosition(int data,int pos)
    {
        Node node=new Node(data);
        node.next=null;
        if(head==null && pos!=1)
        System.out.println("List is empty");
        if(head==null && pos==1)
        head=node;
        else
        {
           Node curr=head;
           for(int i=1;i<pos-1;i++)
           {
               curr=curr.next;
           }
           node.next=curr.next;
           curr.next=node;
        }
        
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
	   //insertAtEnd
	   insertAtEnd(50);
	   insertAtEnd(60);
	   insertAtEnd(70);
	   //insertAtPosition
	   insertAtPosition(80,5);
	   display();
	   
	}
}
