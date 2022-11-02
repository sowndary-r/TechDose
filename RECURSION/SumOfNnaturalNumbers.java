import java.util.*;
public class Main
{
    static int sumOfN(int n)
    {
        if(n==1)   //base case
        return n;
       return n+sumOfN(n-1); //recursion logic
    
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=sumOfN(n);
	System.out.println(sum);
		
	}
}
