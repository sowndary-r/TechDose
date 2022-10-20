class Solution {
    public int orangesRotting(int[][] g) { 
  int[][] dir={{0,1},{1,0},{-1,0},{0,-1}};
  int fresh=0;
   Queue<int[] > q=new LinkedList<>();
   int m=g.length;
   int n=g[0].length;
 for(int i=0;i<m;i++)
 { 
   for(int j=0;j<n;j++)
   { 
    if(g[i][j]==2)
     q.add(new int[]{i,j});
    else if(g[i][j]==1)
     fresh++;
   }
 } 
 if(fresh==0)
   return 0;
 int min=0;
 int size=0;
  while(!q.isEmpty()){
 size=q.size();
  for(int i=0;i<size;i++)
  { 
   int[] pos=q.poll();
   for(int[] d:dir)
   { 
     int x=pos[0]+d[0];
     int y=pos[1]+d[1];
    if(x>=0&&x<m&&y>=0&&y<n&&g[x][y]==1)
     { 
      fresh--;  
     g[x][y]=2;
     q.add(new int[]{x,y});
      } 
     
   } 
    
 }
      min++;
  } 
  return fresh==0?min-1:-1;
    }
}
