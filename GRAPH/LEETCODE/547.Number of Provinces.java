//Approach - DFS traversal
class Solution {
    static boolean vis[];
    public int findCircleNum(int[][] mat) {
        int c=0;
        vis=new boolean[mat.length];
        for(int i=0;i<mat.length;i++)
        {
            if(!vis[i])
            {
                dfs(mat,i);
                c++;
            }
        }
        return c;
    }
    void dfs(int[][] mat,int i)
    {
        vis[i]=true;
        for(int j=0;j<mat[i].length;j++)
        {
            if(!vis[j]&&mat[i][j]==1)
                dfs(mat,j);
        }
    }
}
