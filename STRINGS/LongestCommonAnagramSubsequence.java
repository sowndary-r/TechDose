import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    String b=sc.next();
	    int f1[]=new int[26];
	    int f2[]=new int[26];
	    int len=0;
      
	    for(int i=0;i<a.length();i++)
	    f1[a.charAt(i)-'a']++;
      
	    for(int i=0;i<b.length();i++)
	    f2[b.charAt(i)-'a']++;
      
	    for(int i=0;i<26;i++)
	    len+=Math.min(f1[i],f2[i]);
	    
		System.out.println(len);
	}
}
