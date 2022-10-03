class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int i=0,j=0,n=nums.length;
  int sum=0,len=0;
   while(j>=i && j<n)
   {
    sum=sum+nums[j];
    if(sum>=target)
    { 
     len=len==0?j-i+1:Integer.min(len,j-i+1);
     
     sum=sum-nums[i]-nums[j];
        i++;
    }
    else 
     j++;
   }
   return len;
    }
}

