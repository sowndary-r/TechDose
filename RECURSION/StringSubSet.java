import java.util.*;
public class Main
{
    static List<String> res=new ArrayList<>();
    static String curr="";
    static void subset(String s,int pos,String curr)
    {
        if(pos==s.length())  //basecase
        {
            res.add(curr);
            return;
        }
      subset(s,pos+1,curr); //recursion logic
      curr=curr+s.charAt(pos);
      subset(s,pos+1,curr);
    
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	subset(str,0,curr);
	System.out.println(res);
		
	}
}
