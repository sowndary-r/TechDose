//Approach - dijkshtras algorithm

class Solution {
    int dij(List<List<int[]>> adj,int v,int k)
    {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        int dis[]=new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
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
            if(i==Integer.MAX_VALUE)
                return -1;
            res=Math.max(res,i);
        }
        return res;
    }
    public int networkDelayTime(int[][] t, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<t.length;i++)
            adj.get(t[i][0]-1).add(new int[]{t[i][1]-1,t[i][2]});
        return dij(adj,n,k-1);
    }
}
