import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    int n=a.length();
	    int dp[][]=new int[n+1][n+1];
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(a.charAt(i-1)==a.charAt(j-1) && i!=j)dp[i][j]=1+dp[i-1][j-1]; //same as LCS, only extra condition is i!=j
	            else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    System.out.println(dp[n][n]);
	}
}
