//Approach : BFS 
//TC : O(N+2E)
import java.util.*;
public class Main
{
    //cycle detection method using bfs
    static boolean iscycle(List<List<Integer>> adj,boolean[] vis,int curr)
    {
        vis[curr]=true;
        Queue<int []> q=new LinkedList<>();
        q.add(new int[]{curr,-1});

        while(!q.isEmpty())
        {
          int arr[]=q.poll();
          int node=arr[0];
          int par=arr[1];
          vis[node]=true;
          for(int i=0;i<adj.get(node).size();i++)
          {
              if(vis[adj.get(node).get(i)]==false)
              {
                  vis[adj.get(node).get(i)]=true;
                   q.add(new int[]{adj.get(node).get(i),node});
              }
              else if(adj.get(node).get(i)!=par)
              return true;
          }
          
        }
        return false;
    }
	public static void main(String[] args) {
	    int v=7;
		
		//adjacency list 
		List<List<Integer>> l=new ArrayList<>();
		for(int i=0;i<v;i++)
		l.add(new ArrayList<>());
	    l.get(0).add(1);
	    l.get(0).add(2);
	    l.get(1).add(0);
	    l.get(1).add(4);
	    l.get(2).add(0);
	    l.get(2).add(3);
	    l.get(2).add(5);
	    l.get(3).add(2);
	    l.get(4).add(1);
	    l.get(4).add(6);
	    l.get(5).add(2);
	    l.get(5).add(6);
	    l.get(6).add(4);
	    l.get(6).add(5);
	    
	    boolean []vis=new boolean[v];
		//cycle Detection 
		if(iscycle(l,vis,0))
		System.out.println("Cycle detected");
		else
		System.out.println("Cycle not detected");
	}
}
