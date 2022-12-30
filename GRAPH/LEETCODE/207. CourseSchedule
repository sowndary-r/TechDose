//Approach - Cycle detection using BFS(Topological sort)
class Solution {
    public boolean canFinish(int n, int[][] pre) {
       int indegree[]=new int[n];
        for(int i=0;i<pre.length;i++)
        {
           indegree[pre[i][1]]++;
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<pre.length;i++)
            adj.get(pre[i][0]).add(pre[i][1]);
        return toposort(adj,indegree,n);
            
    }
    boolean toposort(List<List<Integer>> adj,int[] indegree,int n)
    {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
           int node=q.poll();
            c++;
            for(int i:adj.get(node))
            {
               indegree[i]--;
                if(indegree[i]==0)
                    q.add(i);
            }
        }
        if(c==n)
            return true;
        return false;
    }
}
