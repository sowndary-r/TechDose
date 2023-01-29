import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int count=0;
	    Set<String> set=new HashSet<>();
	    for(int i=0;i<=a.length();i++)
	    {
	        for(int j=i+1;j<=a.length();j++)
	        set.add(s.substring(i,j));
	    }
	    count=set.size();
		System.out.println(count);
	}
}
