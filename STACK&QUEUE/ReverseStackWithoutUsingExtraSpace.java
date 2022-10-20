import java.util.*;
public class Main
{   static Stack<Integer> s=new Stack<>();
	public static void main(String[] args) { 
	    //Stack<Integer> s=new Stack<>();
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.push(40); 
	 System.out.println(s);
	    reverse();
	 System.out.println(s);
	} 
	static void reverse()
	{
	 
	  if(s.size()>0){
	  int temp=s.peek(); 
	  s.pop();
	  reverse();
	  insertAtBottom(temp);
	   }
	 
	}
	static void insertAtBottom(int x)
	{
	  if(s.isEmpty())
	  {
	      s.push(x);
	      
	  }
	  else{
	  int temp=s.peek(); 
	  s.pop();
	  insertAtBottom(x);
	  s.push(temp); 
	  }
	}
}
