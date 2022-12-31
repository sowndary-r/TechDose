//TC - O(V^2)
import java.util.*;
public class Main
{
    static void findMST(List<List<int[]>> adj,int v)
    {
        
        int[] dis=new int[v]; //creating distance Array to keep tracking of min cost values
        Arrays.fill(dis,Integer.MAX_VALUE); //initially infinity
  
        boolean[] visited=new boolean[v]; //creating bool array to keep tracking the already included node in MST . initially false(not visited yet)
      
        int[] parent=new int[v]; //creating parent array for remembering the edges with min cost
        Arrays.fill(parent,-1); //initially -1(no connection) 
        
        dis[0]=0; //making 0 vertex as source
        for(int i=0;i<v-1;i++)
        {
          int vertex=findmin(dis,visited); //step 1 : find minimum cost unvisited vertex 
          visited[vertex]=true;  //step 2: make it as visited
          for(int[] a:adj.get(vertex))  //step 3: computing all the adjacent node distance
          {
            int ver=a[0];
            int cost=a[1];
            if(cost<dis[ver])
            {
                dis[ver]=cost;
                parent[ver]=vertex;
            }
          }
        }
        
        //printing the MST
        for(int i=0;i<v;i++)
        System.out.println(i+" - "+parent[i]+" with cost "+dis[i]);
    }
    static int findmin(int[] dis,boolean[] vis)
    {
        int min=Integer.MAX_VALUE,vertex=0;
        for(int i=0;i<dis.length;i++)
        {
           if(!vis[i]&&dis[i]<=min) //if the vertex is not visited and contains minimum distance value
           {
               vertex=i;
               min=dis[i];
           }
        }
        return vertex;
    }
	public static void main(String[] args) {
	    int v=4;
		List<List<int[]>> adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		adj.add(new ArrayList<>());
		
		//adjacency list with cost
		adj.get(0).add(new int[]{1,3});  //--> adj vertex- 1,cost - 3
		adj.get(0).add(new int[]{2,1});  //--> adj vertex- 2,cost - 1
		adj.get(1).add(new int[]{0,3});  //--> adj vertex- 0,cost - 3
		adj.get(1).add(new int[]{3,4});  //--> adj vertex- 3,cost - 4
		adj.get(1).add(new int[]{2,2});  //--> adj vertex- 2,cost - 2
		adj.get(2).add(new int[]{0,1});  //--> adj vertex- 0,cost - 1
		adj.get(2).add(new int[]{1,2});  //--> adj vertex- 1,cost - 2
		adj.get(2).add(new int[]{3,5});  //--> adj vertex- 3,cost - 5
		adj.get(3).add(new int[]{1,4});  //--> adj vertex- 1,cost - 4
		adj.get(3).add(new int[]{2,5});  //--> adj vertex- 2,cost - 5
		
		findMST(adj,v);
		
	}
}
