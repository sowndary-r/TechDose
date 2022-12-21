class Solution {
    static int seg[];
    static int n;
    static void buildSegmentTree(int a[],int st,int start,int end)
    {
      if(start>end)
          return;
      if(start==end)
      {
        seg[st]=a[start];
          return;
      }
      int mid=start+(end-start)/2;
       buildSegmentTree(a,2*st,start,mid);
       buildSegmentTree(a,2*st+1,mid+1,end);
       seg[st]=seg[2*st]^seg[2*st+1];
    }
    static int query(int qs,int qe,int st,int s,int e)
    {
      if(s>qe||e<qs)
          return 0;
    if(s>=qs&&e<=qe)
        return seg[st];
      int mid=s+(e-s)/2;
        int lxor=query(qs,qe,2*st,s,mid);
        int rxor=query(qs,qe,2*st+1,mid+1,e);
        return lxor^rxor;
    }
    public int[] xorQueries(int[] arr, int[][] q) {
        seg=new int[4*arr.length+1];
        int []res=new int[q.length];
        n=arr.length;
        buildSegmentTree(arr,1,0,arr.length-1);
        for(int i=0;i<q.length;i++)
        {
          int qs=q[i][0];
          int qe=q[i][1];
            
           res[i]= query(qs,qe,1,0,n-1);
        }
        return res;
    }
}
