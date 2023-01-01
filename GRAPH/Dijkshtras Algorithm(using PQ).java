import java.util.*;
public class Main
{
    static void dij(List<List<int[]>> adj,int v)
    {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{0,0});
        int dis[]=new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0]=0;
        while(!pq.isEmpty())
        {
            int node[]=pq.poll();
            int ver=node[0];
            int cost=node[1];
            for(int[] a:adj.get(ver))
            {
                if(cost+a[1]<dis[a[0]])
                {
                    dis[a[0]]=cost+a[1];
                    pq.add(new int[]{a[0],dis[a[0]]});
                }
            }
        }
        int res=0;
        for(int i:dis)
        {
            res=Math.max(res,i);
        }
       System.out.println("shortest path cost = "+res);
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
     	dij(adj,v);
		
	}
}
