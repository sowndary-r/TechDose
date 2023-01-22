class Solution {
    public int longestPalindromeSubseq(String s) {
        String ori=s;
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=s.length();j++)
            {
                if(ori.charAt(i-1)==rev.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s.length()][s.length()];
    }
}
