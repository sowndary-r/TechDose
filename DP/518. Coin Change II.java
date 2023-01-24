class Solution {
    public int change(int amt, int[] coins) {
   int dp[][]=new int[coins.length+1][amt+1];
        for(int i=1;i<=coins.length;i++)
        {
            for(int j=0;j<=amt;j++)
            {
                if(j==0)dp[i][j]=1;
                else if(coins[i-1]>j)dp[i][j]=dp[i-1][j];
                else dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
            }
        }
       return dp[coins.length][amt];
     
    }
    
}
