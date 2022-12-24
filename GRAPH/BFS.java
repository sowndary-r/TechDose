import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    int vertex=6;
	    List<List<Integer>> adj=new ArrayList<>();
	    Queue<Integer> q=new LinkedList<>();
	    List<Integer> res=new ArrayList<>();
	    boolean vis[]=new boolean[vertex];
	    adj.add(Arrays.asList(2,1));
	    adj.add(Arrays.asList(0,3,5));
	    adj.add(Arrays.asList(3,4,0));
	    adj.add(Arrays.asList(1,2));
	    adj.add(Arrays.asList(2,5));
	    adj.add(Arrays.asList(1,4));
	    q.add(0);
	    vis[0]=true;
	    while(!q.isEmpty())
	    {
	       int node=q.poll();
	       res.add(node);
	       for(int i=0;i<adj.get(node).size();i++)
	       {
	           if(vis[adj.get(node).get(i)]==false)
	           {
	               vis[adj.get(node).get(i)]=true;
	               q.add(adj.get(node).get(i));
	           }
	       }
	    }
	   System.out.print(res); 
	  
	}
}
