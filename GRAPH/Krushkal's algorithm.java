//TC - O(ElogE + ElogV) 
import java.util.*;
public class Main
{
    static int[] parent;
    static void findMST(int[][] edges,int v)
    {
        parent=new int[v];
        Arrays.fill(parent,-1); //initially -1(not connected)
        //sorting edges array based on the weight
        Arrays.sort(edges,(a,b)->{
            if(a[0]==a[0])
            {
                if(a[1]==a[1])
                {
                     return a[2]-b[2];
                }
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        int count=0,totalwt=0;
        for(int i=0;i<edges.length;i++)
        {
           int src=edges[i][0];
           int des=edges[i][1];
           int wt=edges[i][2];
           int srcpar=findparent(src);
           int despar=findparent(des);
           if(srcpar!=despar) //if both the abs parents are different(does not form cycle),  then include that edge.
           {
               count++;
               parent[srcpar]=des;
               totalwt+=wt;
               
           }
           if(count==v-1) //if no of edges reaches v-1 edges(which is required for MST), break the process.
           break;
        }
        System.out.println("Minimum cost = "+totalwt);
    }
    static int findparent(int node)
    {
        if(parent[node]==-1)
        return node;
        else
        return findparent(parent[node]);
    }
	public static void main(String[] args) {
		int v=6;
    //edge matrix with edge[0] = src and edge[1] = des and edge[2] = weight/cost
		int edges[][]={
		    {3,5,4},
		    {4,5,3},
		    {1,4,3},
		    {1,2,3},
		    {3,4,2},
		    {2,3,2},
		    {0,2,2},
		    {2,4,1},
		    {1,3,1},
		    {0,1,1}
		};  
		findMST(edges,v);
	}
}
