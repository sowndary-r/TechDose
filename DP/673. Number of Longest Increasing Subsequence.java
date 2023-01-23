class Solution {
    public int findNumberOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        int c[]=new int[nums.length];
        Arrays.fill(lis,1);
         Arrays.fill(c,1);
        int max=1;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
               if(nums[i]>nums[j])
               {
                   if(lis[i]<=lis[j])
                   {
                       lis[i]++;
                       c[i]=c[j];
                   }
                   else if(lis[j]+1==lis[i])
                       c[i]+=c[j];
               }
                
            }
            max=Math.max(max,lis[i]);
        }
        for(int i=0;i<lis.length;i++)
        {
            if(lis[i]==max)res+=c[i];
        }
        return res;
    }
}
