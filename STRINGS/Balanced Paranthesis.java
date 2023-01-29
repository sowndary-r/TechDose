import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    System.out.print(isbalanced(a));
	}
	static boolean isbalanced(String a)
	{
	    Stack<Character> st=new Stack<>();
	    for(int i=0;i<a.length();i++)
	    {
	        char c=a.charAt(i);
	        // if opening bracket, push in stack
	        if(c=='{'||c=='('||c=='[') 
	        {
	            st.push(c);
	            continue;
	        }
	        //if closing bracket , check the following conditions
	        if(st.isEmpty())return false; 
	        if(c==')' && st.pop()!='(')return false;
	        else if(c==']' && st.pop()!='[')return false;
	        else if(c=='}' && st.pop()!='{')return false;
	    }
	    return st.isEmpty();
	}
}
