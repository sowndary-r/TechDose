//Time Complexity - O(logN)
public class Main
{
    
    static 	int a[]={1,3,2,-2,4,5};
    static  int seg[];  //segment tree array
	public static void main(String[] args) {
    int n=6;
    seg=new int[4*n+1];   //declaring the size of the segment tree
	buildSegmentTree(1,0,n-1);
	for(int i:seg)
	System.out.println(i);
	}
	static void buildSegmentTree(int st,int start,int end)
	{
	    if(start>end)  //if starting index goes higher than the ending index just return
	    return;
	    if(start==end) //for leaf node, assign the value of given arr at that starting index
	   {
	        seg[st]=a[start];
	        return;
	   }
	    int mid=start+(end-start)/2; //binary partition 
	    buildSegmentTree(2*st,start,mid); //left recursion
	    buildSegmentTree(2*st+1,mid+1,end); //right recursion
	    seg[st]=seg[2*st]+seg[2*st+1]; //assigning the value for parent node
	}
}
