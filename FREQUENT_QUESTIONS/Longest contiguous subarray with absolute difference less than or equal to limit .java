class Solution {
    public int longestSubarray(int[] nums, int limit) {
      //declaring deques 
  Deque<Integer> max =new LinkedList<>();
  Deque<Integer> min= new LinkedList<>();
  int start=0;
  int ans=0;
  for(int end=0;end<nums.length;end++)
 { 
   while(!max.isEmpty() && max.peekLast()<nums[end])
     max.pollLast();
   while(!min.isEmpty() && min.peekLast()>nums[end])
    min.pollLast();
    max.addLast(nums[end]);
    min.addLast(nums[end]);
   if(max.peekFirst()-min.peekFirst()>limit)
   {  
     if(max.peekFirst()==nums[start])
     max.pollFirst();
if(min.peekFirst()==nums[start])
     min.pollFirst();
      start++; 
   } 
   ans=Math.max(ans,end-start+1);
 } 
        return ans;
    }
}
