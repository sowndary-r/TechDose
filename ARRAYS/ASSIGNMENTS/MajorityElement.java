class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0],count=1;
     for(int i=0;i<nums.length;i++) 
    {
      if(nums[i]!=m)
          {
         count-=1;
        if(count==0)
       { m=nums[i];
         count=1;}
          }
      else 
          count+=1;
     }
        return m;
    }
}
