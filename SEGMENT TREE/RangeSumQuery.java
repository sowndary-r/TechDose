class NumArray {

    static int n;
    static int seg[];
    static void buildSegmentTree(int[] a,int st,int start,int end)
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
        seg[st]=seg[2*st]+seg[2*st+1];
            
    }
    static int query(int qs,int qe,int st,int s,int e)
    {
       if(s>qe || e<qs)
           return 0;
        if(s>=qs && e<=qe)
            return seg[st];
        int mid=s+(e-s)/2;
        int lsum=query(qs,qe,2*st,s,mid);
        int rsum=query(qs,qe,2*st+1,mid+1,e);
        return lsum+rsum;
    }
    public NumArray(int[] nums) {
       n=nums.length;
      seg=new int[4*n+1];
        buildSegmentTree(nums,1,0,n-1);
    }
    
    public int sumRange(int left, int right) {
        return query(left,right,1,0,n-1);
    }
}
