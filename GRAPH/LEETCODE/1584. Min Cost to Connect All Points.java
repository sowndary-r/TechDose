//Approach - using Prim's algorithm to find minimum cost
class Solution {
    int findmst(List<List<int[]>> adj,int v)
    {
        int mincost=0;
       int []dis=new int[v];
       Arrays.fill(dis,Integer.MAX_VALUE);
       boolean []vis=new boolean[v];
       int []par=new int[v];
       Arrays.fill(par,-1);
        dis[0]=0;
        for(int i=0;i<v-1;i++)
        {
           int vertex=findmin(dis,vis);
           vis[vertex]=true;
           for(int[] a:adj.get(vertex))
           {
               int ver=a[0];
               int cost=a[1];
               if(!vis[ver]&&dis[ver]>cost)
               {
                   dis[ver]=cost;
                   par[ver]=vertex;
               }
           }
        }
        for(int i:dis)
         mincost+=i;
        return mincost;
        
    }
    int findmin(int[] dis,boolean vis[])
    {
       int min=Integer.MAX_VALUE,ver=0;
        for(int i=0;i<dis.length;i++)
        {
            if(!vis[i]&&dis[i]<min)
            {
               min=dis[i];
               ver=i;
            }
        }
        return ver;
    }
    public int minCostConnectPoints(int[][] p) {
        int v=p.length;
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
             if(i!=j)
             {
               int x1=p[i][0];
               int y1=p[i][1];
               int x2=p[j][0];
               int y2=p[j][1];
               int cost=Math.abs(x1-x2)+Math.abs(y1-y2);
               adj.get(i).add(new int[]{j,cost});
             }
            }
        }
        int mincost=findmst(adj,v);
        return mincost;
    }
}
