class Solution {
    public boolean isMatch(String s, String p) {
        int n=p.length();
        int m=s.length();
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int j=1;j<=m;j++)
        {
            dp[0][j]=false;
        }
        for(int i=1;i<=n;i++)
        {
            boolean flag=true;
            for(int ii=1;ii<=i;ii++)
            {
                if(p.charAt(ii-1)!='*'){
                    flag=false;
                    break;
                }
            }
            dp[i][0]=flag;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(p.charAt(i-1)==s.charAt(j-1)||p.charAt(i-1)=='?')
                        dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(i-1)=='*')
                        dp[i][j]=dp[i-1][j]|dp[i][j-1];
                else 
                        dp[i][j]=false;

            }
        }
        return dp[n][m];
    }
}
