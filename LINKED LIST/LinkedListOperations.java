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
     void insertAtBeginning(Main list,int data)
    {
        Node node=new Node(data);
        node.next=null;
        if(list.head==null)
        list.head=node;
        else
        {
            Node first=head;
            head=node;
            node.next=first;
        }
        
    }
    void insertAtEnd(Main list,int data)
    {
        Node node=new Node(data);
        node.next=null;
        if(list.head==null)
        list.head=node;
        else{
            Node curr=list.head;
            while(curr.next!=null)
            curr=curr.next;
            curr.next=node;
        }
    }
    void insertAtPosition(Main list,int data,int pos)
    {
        Node node=new Node(data);
        node.next=null;
        if(list.head==null && pos!=1)
        System.out.println("List is empty");
        if(list.head==null && pos==1)
        list.head=node;
        else
        {
           Node curr=list.head;
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
	   list.insertAtBeginning(list,40);
	   list.insertAtBeginning(list,30);
	   list.insertAtBeginning(list,20);
	   list.insertAtBeginning(list,10);
	   //insertAtEnd
	   list.insertAtEnd(list,50);
	   list.insertAtEnd(list,60);
	   list.insertAtEnd(list,70);
	   //insertAtPosition
	   list.insertAtPosition(list,80,5);
	   display();
	   
	}
}
