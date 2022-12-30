//Approach - graph coloring (2 color)
import java.util.*;
public class Main
{
    //Bipartite graph checking using BFS
    static boolean bipar(List<List<Integer>> adj,int v)
    {
        Queue<Integer> q=new LinkedList<>();
        int color[]=new int[v];
	   	Arrays.fill(color,-1); 
        q.add(0);
        color[0]=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(Integer i:adj.get(node))
            {
                if(color[i]==-1)
                {
                  color[i]=color[node]==0?1:0;  
                  q.add(i);
                }
                else if(color[i]==color[node])
                return false;
                
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    int v=10;
		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<>());
		
		//adjacency list
		/*adj.get(0).add(1);
	  	adj.get(1).add(0);
		  adj.get(1).add(2);
		  adj.get(1).add(4);
	    adj.get(2).add(1);
	    adj.get(2).add(3);
	    adj.get(3).add(2);
	   	adj.get(3).add(5); 
	   	adj.get(3).add(6);   //not a bipartite graph
	   	adj.get(4).add(1);
	   	adj.get(4).add(5);
	   	adj.get(5).add(3);
	    adj.get(5).add(4);
	   	adj.get(6).add(3);
	   	adj.get(6).add(7);
	   	adj.get(7).add(6);*/
	   
	    adj.get(0).add(1);
		  adj.get(1).add(0);
		  adj.get(1).add(2);
		  adj.get(2).add(3);
	    adj.get(2).add(1);
	    adj.get(2).add(5);
	    adj.get(3).add(2);
	   	adj.get(3).add(4);
	   	adj.get(4).add(3);
	   	adj.get(4).add(7);
	   	adj.get(5).add(2);   //bipartite graph
	   	adj.get(5).add(6);
	    adj.get(6).add(5);
	   	adj.get(6).add(7);
	   	adj.get(7).add(4);
	   	adj.get(7).add(6);
	   	adj.get(7).add(8);
	   	adj.get(8).add(7);
	   	adj.get(8).add(9);
	   	adj.get(9).add(8);
	   
	   	if(bipar(adj,v))
	   	System.out.println("Bipartite graph");
	    else
	   	System.out.println("not a bipartite graph");
	}
}
