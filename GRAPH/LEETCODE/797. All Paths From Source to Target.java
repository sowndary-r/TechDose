//Approach - DFS
class Solution {
     boolean vis[];
     List<List<Integer>> path;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        path=new ArrayList<>();
         List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++)
        {
            for(int j=0;j<graph[i].length;j++)
            {
               adj.get(i).add(graph[i][j]);
            }
        }
        List<Integer> temp=new ArrayList<>();
        temp.add(0);
             dfs(0,adj,temp);
      
        return path;
    }
    void dfs(int source,List<List<Integer>> adj,List<Integer> temp)
    {
        vis[source]=true;
        if(source==adj.size()-1)
        {
            path.add(new ArrayList<>(temp));
            return;
        }
        for(int i:adj.get(source))
        {
            temp.add(i);
                 dfs(i,adj,temp);
            temp.remove(temp.size()-1);
        }
               
            
        }
        
    
    
}
