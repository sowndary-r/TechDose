public class Main
{
    static int seg[],n;
    static int max=Integer.MIN_VALUE;
    static void buildSegmentTree(int[] a,int st,int start,int end)
    {
        if(start>end)
        return;
        if(start==end)
        {
            seg[st]=a[start];
            return;
        }
        int mid=start+(end - start)/2;
        buildSegmentTree(a,2*st,start,mid);
        buildSegmentTree(a,2*st+1,mid+1,end);
        seg[st]=Math.max(seg[2*st],seg[2*st+1]);
    }
    static int rangemax(int qs,int qe,int st,int s,int e)
    {
       if(s>qe||e<qs)
       return 0;
       if(s>=qs&&e<=qe)
       return Math.max(max,seg[st]);
       int mid=s+(e-s)/2;
       int max1=rangemax(qs,qe,2*st,s,mid);
       int max2=rangemax(qs,qe,2*st+1,mid+1,e);
       return Math.max(max1,max2);
    }
	public static void main(String[] args) {
		int a[]={1,3,2,-2,4,5};
		n=a.length;
		seg=new int[4*n+1];
		buildSegmentTree(a,1,0,n-1);
		System.out.println("RANGE MAXIMUM FOR RANGE (0,5)-->"+rangemax(0,0,1,0,n-1));
	}
}
