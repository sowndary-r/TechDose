import java.util.*;
public class Main
{
    static boolean visited[];
    static List<List<Integer>> adj;
    static List<Integer> res;
    //dfs traversal
    static void dfs(int v, List<List<Integer>> adj)
    {
         visited[v]=true;
         res.add(v);
        for(int i=0;i<adj.get(v).size();i++)
        {
            int curr=adj.get(v).get(i);
            if(!visited[curr])
            {
              visited[curr]=true;
              dfs(curr,adj);
            }
        }
    }
	public static void main(String[] args) {
	    int n=6;
	    res=new ArrayList<>();
	    //creating adjacency list
	    adj=new ArrayList<>();
	    adj.add(Arrays.asList(1,2)); //0th vertex
	    adj.add(Arrays.asList(0,3,4)); //1st vertex
	    adj.add(Arrays.asList(0,4)); //2nd vertex
	    adj.add(Arrays.asList(1,4,5)); //3rd vertex
	    adj.add(Arrays.asList(2,3,5)); //4th vertex
	    adj.add(Arrays.asList(3,4));  //5th vertex
	    
	    //creating visited Array
	    visited=new boolean[n];
	    //calling dfs method
	    dfs(0,adj);
		System.out.println(res);
	}
}
