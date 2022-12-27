public class Main
{
    
    static int seg[];
    
    //finding gcd
    static int gcd(int a,int b)
    {
        return b==0?a:gcd(b,a%b);
    }
    
    //build segment tree method
    static void buildseg(int a[],int st,int start,int end)
    {
        if(start>end)
        return;
        if(start==end)
        {
            seg[st]=a[start];
            return;
        }
        int mid=start+(end-start)/2;
        buildseg(a,2*st,start,mid);
        buildseg(a,2*st+1,mid+1,end);
        seg[st]=gcd(seg[2*st],seg[2*st+1]);
    }
    
    //query method
    static int query(int qs,int qe,int st,int s,int e)
    {
        if(qe<s||e<qs)
        return 0;
        if(s>=qs&&e<=qe)
        return seg[st];
        int mid=s+(e-s)/2;
        int lgcd=query(qs,qe,2*st,s,mid);
        int rgcd=query(qs,qe,2*st+1,mid+1,e);
        return gcd(lgcd,rgcd);
    }
    
    //update method
    static void update(int st,int start,int end,int pos,int val)
    {
        if(start>pos||pos>end)
        return;
        if(start==end)
        {
            seg[st]=val;
            return;
        }
        int mid=start+(end-start)/2;
        update(2*st,start,mid,pos,val);
        update(2*st+1,mid+1,end,pos,val);
        seg[st]=gcd(seg[2*st],seg[2*st+1]);
        
    }
    
	public static void main(String[] args) {
	    int n=5;
	    int a[]={2,3,60,90,50};
	    seg=new int[4*n+1];
	    
	    //build segment Tree
	    buildseg(a,1,0,n-1);
	    for(int i:seg)
	    System.out.print(i+" ");
	    System.out.println();
	    
	    //query of getting gcd between the given range 
	    System.out.println("GCD between given range(1,3) is --> "+query(1,3,1,0,n-1));
		
		//updating the value in particular position
		update(1,0,n-1,1,30);
		System.out.println("After updating ");
		for(int i:seg)
		  System.out.print(i+" ");
	    System.out.println();
	}
}
