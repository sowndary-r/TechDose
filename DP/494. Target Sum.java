class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums)sum+=i;
        if(sum+target<0 || sum<target || (sum-target)%2!=0)return 0;
        int t=(target+sum)/2;
        int dp[][]=new int[nums.length+1][t+1];
        dp[0][0]=1;
        for(int i=1;i<=nums.length;i++)
        {
            for(int j=0;j<=t;j++)
            {
                if(nums[i-1]>j)dp[i][j]=dp[i-1][j];
                  else dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
            }
        }
        return dp[nums.length][t];
    }
}
