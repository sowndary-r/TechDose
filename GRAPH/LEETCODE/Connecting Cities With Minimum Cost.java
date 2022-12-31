/*There are n cities and there are roads in between some of the cities. Somehow all the roads are damaged simultaneously. We have to repair the roads to connect the cities again. There is a fixed cost to repair a particular road. Find out the minimum cost to connect all the cities by repairing roads. Input is in matrix(city) form, if city[i][j] = 0 then there is not any road between city i and city j, if city[i][j] = a > 0 then the cost to rebuild the path between city i and city j is a. Print out the minimum cost to connect all the cities. 
It is sure that all the cities were connected before the roads were damaged.

Examples: 

Input : {{0, 1, 2, 3, 4},
         {1, 0, 5, 0, 7},
         {2, 5, 0, 6, 0},
         {3, 0, 6, 0, 0},
         {4, 7, 0, 0, 0}};
Output : 10*/
//Approach - Prim's Algorithm

import java.util.*;
public class Main
{
    static int findMST(int [][]adj,int v)
    {
      int []dis=new int[v];
      Arrays.fill(dis,Integer.MAX_VALUE);
      boolean vis[]=new boolean[v];
      int []par=new int[v];
      Arrays.fill(par,-1);
      dis[0]=0;
      for(int i=0;i<v;i++)
      {
        int vertex=findmin(dis,vis);
        vis[vertex]=true;
        for(int j=0;j<adj.length;j++)
        {
           if(adj[vertex][j]!=0 && !vis[j] && dis[j]>adj[vertex][j])
           {
               dis[j]=adj[vertex][j];
               par[j]=vertex;
           }
        }
      }
      int mincost=0;
      for(int i:dis)
      mincost+=i;
      return mincost;
    }
    static int findmin(int[] dis,boolean[] vis)
    {
        int min=Integer.MAX_VALUE,vertex=0;
        for(int i=0;i<dis.length;i++)
        {
           if(!vis[i]&&dis[i]<=min)
           {
               vertex=i;
               min=dis[i];
           }
        }
        return vertex;
    }
	public static void main(String[] args) {
		int adjmat[][]={{0, 1, 2, 3, 4},
         {1, 0, 5, 0, 7},
         {2, 5, 0, 6, 0},
         {3, 0, 6, 0, 0},
         {4, 7, 0, 0, 0}};
         int v=adjmat.length;
		 System.out.println(findMST(adjmat,v));
		
	}
}
