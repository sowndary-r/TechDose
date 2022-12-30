//Approach - topological sort(Khanes algorithm) 
import java.util.*;
public class Main
{
    //topologocial sort using BFS
    static boolean toposort(List<List<Integer>> adj,int indegree[],int v)
    {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        int cnt=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            cnt++;
            for(Integer i:adj.get(node))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(cnt==v)
        return true;
        else
        return false;
    }
	public static void main(String[] args) {
	    int v=5;
		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<>());
		
		  //adjacency list
		  //adj.get(5).add(2);
		  //adj.get(5).add(0);
		  //adj.get(4).add(0);  //acyclic
	    //adj.get(4).add(1);
	   	//adj.get(3).add(1);
	    //adj.get(2).add(3);
	   	
	   	adj.get(0).add(1);
	  	adj.get(2).add(1);
		  adj.get(2).add(3);    //cyclic
	    adj.get(3).add(4);   
	   	adj.get(4).add(0);
	   	adj.get(4).add(2);
	   	
	   	//indegree Array
	   	int indegree[]=new int[v];
	   	for(int i=0;i<v;i++)
	   	{
	   	    for(Integer it:adj.get(i))
	   	    {
	   	        indegree[it]++;
	   	    }
	   	}
	   	if(toposort(adj,indegree,v))
	   	System.out.println("Cycle is not detected");
	   	else
	    System.out.println("Cycle is detected");
	}
}
