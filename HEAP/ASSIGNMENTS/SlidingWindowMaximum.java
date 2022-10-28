class Solution{
    class Num{
        int data;
        int index;
        public Num(int d,int i)
        {
          data=d;
          index=i;
        }
    }
      public int[] maxSlidingWindow(int[] nums, int k)
      {
         int l=0,r=0;
         PriorityQueue<Num> q=new PriorityQueue<>((a,b)->Integer.compare(b.data,a.data));
          int arr[]=new int[nums.length-k+1];
         while(r<nums.length)
         {
             if(r-l<k)
             {
                 q.add(new Num(nums[r],r));
                 r++;
             }
             if(r-l==k)
             {
              arr[l++]=q.peek().data;  
             }
             while(!q.isEmpty()&&q.peek().index<l)
                 q.poll();
             
         }
          return arr;
      }
}
