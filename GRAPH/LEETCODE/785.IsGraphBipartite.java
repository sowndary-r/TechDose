//Approach - graph colouring(2 color)
class Solution {
    public boolean isBipartite(int[][] graph) {
        int v=graph.length;
        int []color=new int[v];
        Arrays.fill(color,-1);
        for(int i=0;i<v;i++)
        {
        if(color[i]==-1)
        { 
            if(isbipar(graph,v,i,color)==false)
            return false;
        }
        }
        return true;
    }
    boolean isbipar(int[][] graph,int v,int curr,int[] color)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(curr);
        color[curr]=1;
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int i:graph[node])
            {
                if(color[i]==-1)
                {
                     color[i]=1-color[node];
                     q.add(i);
                }
                else if(color[i]==color[node])
                    return false;
            }
        }
        return true;
    }
}
