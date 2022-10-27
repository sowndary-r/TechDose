//TC-O(log n)
//Approach - topdown (percolate down)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={0,1,8,6,3,4,2,5};
	    heapify(a,1);
	    for(int i:a)
		System.out.print(i+" ");
	}
	static void heapify(int[] arr,int i)
	{
	    int lar=i;
	    int l=2*i;
	    int r=2*i+1;
	    if(l>=arr.length||r>=arr.length)
	    return;
	    if(arr[l]>arr[i]&&l<arr.length)
	    lar=l;
	    if(arr[r]>arr[l]&&r<arr.length)
	    lar=r;
	    if(lar!=i)
	    {
	        swap(arr,i,lar);
	        heapify(arr,lar);
	    }
	}
	static void swap(int[] a,int i,int j)
	{
	    int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
}
