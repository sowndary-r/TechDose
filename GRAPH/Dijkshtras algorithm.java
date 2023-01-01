//Approach - to find shortest path
//TC - O(V^2)
import java.util.*;
public class Main
{
    static void findshortpath(List<List<int[]>> adj,int v)
    {
        boolean vis[]=new boolean[v];
        int dis[]=new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        int par[]=new int[v];
        Arrays.fill(par,-1);
        dis[0]=0;
        for(int i=0;i<v;i++)
        {
            int vertex=findminver(dis,vis);
            vis[vertex]=true;
            for(int[] a:adj.get(vertex))
            {
                int node=a[0];
                int cost=a[1];
                if(!vis[node]&&dis[vertex]+cost<dis[node])
                {
                    dis[node]=dis[vertex]+cost;
                    par[node]=vertex;
                }
            }
        }
        int maxcost=Integer.MIN_VALUE;
        for(int i:dis)
        maxcost=Math.max(maxcost,i);
        System.out.println("Shortest path with mincost "+maxcost+"is ");
        for(int i=0;i<v;i++)
        System.out.println(i+" - "+par[i]+" with cost "+dis[i]);
        
    }
    static int findminver(int[] dis,boolean[] vis)
    {
        int ver=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<dis.length;i++)
        {
            if(!vis[i]&&dis[i]<min)
            {
                ver=i;
                min=dis[i];
            }
        }
        return ver;
    }
	public static void main(String[] args) {
	    int v=6;
		List<List<int[]>> adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<>());
		adj.get(0).add(new int[]{1,4}); //adj vertex - 1,weight=4
		adj.get(0).add(new int[]{2,4}); //adj vertex - 2,weight=4
		adj.get(1).add(new int[]{0,4}); //adj vertex - 0,weight=4
		adj.get(1).add(new int[]{2,2}); //adj vertex - 2,weight=2
		adj.get(2).add(new int[]{0,4}); //adj vertex - 0,weight=4
		adj.get(2).add(new int[]{1,2}); //adj vertex - 1,weight=2
		adj.get(2).add(new int[]{3,3}); //adj vertex - 3,weight=3
		adj.get(2).add(new int[]{4,1}); //adj vertex - 4,weight=1
		adj.get(2).add(new int[]{5,6}); //adj vertex - 5,weight=6
		adj.get(3).add(new int[]{2,3}); //adj vertex - 2,weight=3
    adj.get(3).add(new int[]{5,2}); //adj vertex - 5,weight=2
    adj.get(4).add(new int[]{2,3}); //adj vertex - 2,weight=3
    adj.get(4).add(new int[]{5,3}); //adj vertex - 5,weight=3
    adj.get(5).add(new int[]{2,6}); //adj vertex - 2,weight=6
   	adj.get(5).add(new int[]{3,2}); //adj vertex - 3,weight=2
    adj.get(5).add(new int[]{4,3}); //adj vertex - 4,weight=3
     	findshortpath(adj,v);
		
	}
}
