//Approach : two pointer algorithm
//Time complexity : O(NlogN)

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int a[]=new int[nums.length];
  for(int i=0;i<nums.length;i++)
  a[i]=nums[i];
   Arrays.sort(a);
     int res[]=new int[2];
  int n1=0,n2=0;
  int l=0,h=nums.length-1;
  while(l<h)
  { 
    if(a[l]+a[h]==target)
    { 
      n1=a[l];n2=a[h];
      break;
    }
    else if(a[l]+a[h]<target)
    l++;
    else 
    h--;
      
  }
  int idx=0;
 for(int i=0;i<nums.length;i++)
 { 
   if(nums[i]==n1||nums[i]==n2)
   res[idx++]=i;
 }
  return res;
    }
}
