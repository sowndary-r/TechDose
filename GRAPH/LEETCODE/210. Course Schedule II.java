//Approach - topological sort(Khanes algorithm)
class Solution {
    static int res[];
    public int[] findOrder(int n, int[][] pre) {
        res=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int[] temp:pre) 
            adj.get(temp[1]).add(temp[0]);
             if(top(adj,n))
                 return res;
        return new int[]{};
    }
    boolean top(List<List<Integer>> adj,int n)
    {
        int indegree[]=new int[n];
        for(int i=0;i<n;i++)
        {
          for(Integer it:adj.get(i))
              indegree[it]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
                q.add(i);
        }
        int c=0,ind=0;
        while(!q.isEmpty())
        {
           int node=q.poll();
            res[ind++]=node;
            c++;
            for(Integer i:adj.get(node))
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
