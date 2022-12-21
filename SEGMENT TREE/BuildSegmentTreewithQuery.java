public class Main
{
    
    static int a[]={1,3,2,-2,4,5};
    static int seg[];
	public static void main(String[] args) {
    int n=6;
    seg=new int[4*n+1];
	buildSegmentTree(1,0,n-1);
	for(int i:seg)
	System.out.println(i);
	System.out.println("QUERY_SUM(2,4) --> "+query(2,4,1,0,n-1));
	update(1,0,n-1,2,100);
	System.out.println("UPDATED QUERY ");
	for(int i:seg)
	System.out.println(i);
	}
	static void buildSegmentTree(int st,int start,int end) //Build segment tree
	{
	    if(start>end)
	    return;
	    if(start==end)
	   {
	        seg[st]=a[start];
	        return;
	   }
	    int mid=start+(end-start)/2;
	    buildSegmentTree(2*st,start,mid);
	    buildSegmentTree(2*st+1,mid+1,end);
	    seg[st]=seg[2*st]+seg[2*st+1];
	}
	static int query(int qs,int qe,int st,int start,int end) //Query function
	{
	  if(qs>end || qe<start)
	  return 0;
	  if(start>=qs&&end<=qe)
	  return seg[st];
	  int mid=start+(end-start)/2;
	  int leftsum=query(qs,qe,2*st,start,mid);
	  int rytsum=query(qs,qe,2*st+1,mid+1,end);
	  return leftsum+rytsum;
	    
	}
	static void update(int st,int start,int end,int pos,int val) //update function
	{
	    if(start>pos || end<pos)
	    return;
	    if(start==end)
	    {
	       seg[st]=val;
	       return;
	    }
	    int mid=start+(end-start)/2;
	    update(2*st,start,mid,pos,val);
	    update(2*st+1,mid+1,end,pos,val);
	    seg[st]=seg[2*st]+seg[2*st+1];
	}
}
