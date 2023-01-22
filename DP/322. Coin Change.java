class Solution {
    public int coinChange(int[] c, int amt) {
        int n=c.length;
        int dp[][]=new int[n+1][amt+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=amt;j++)
            {
                if(j==0)dp[i][j]=0;
                else if(i==0)dp[i][j]=100000;
                else if(c[i-1]>j)dp[i][j]=dp[i-1][j]; // if the coin value is greater than the amount, exclude 
                else dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-c[i-1]]); //min of include and exclude
            }
        }
        return dp[n][amt]>1e4?-1:dp[n][amt];
    }
}
