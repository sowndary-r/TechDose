//TC: O(V+E)
import java.util.*;
public class Main
{
    //topologocial sort using BFS
    static void toposort(List<List<Integer>> adj,int indegree[],int v)
    {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        while(!q.isEmpty())
        {
            int node=q.poll();
            System.out.print(node+" ");
            for(Integer i:adj.get(node))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
    }
	public static void main(String[] args) {
	    int v=6;
		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<>());
		
		//adjacency list
		adj.get(5).add(2);
		adj.get(5).add(0);
		adj.get(4).add(0);
	    adj.get(4).add(1);
	   	adj.get(3).add(1);
	   	adj.get(2).add(3);
	   	
	   	//indegree Array
	   	int indegree[]=new int[v];
	   	for(int i=0;i<v;i++)
	   	{
	   	    for(Integer it:adj.get(i))
	   	    {
	   	        indegree[it]++;
	   	    }
	   	}
	   	System.out.println("Indegree array:");
	   	for(int i:indegree)
	   	System.out.print(i+" ");
	   	System.out.println();
	   	System.out.println("After topological sorting");
	    toposort(adj,indegree,v);
	}
}
