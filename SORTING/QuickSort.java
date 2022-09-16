import java.util.*;
public class Main
{ 
 static int partition (int a[],int low,int high)
 {
  int piv=a[low],i=low,j=high;
  do{
   do{
      i++; 
   }while(a[i]<=piv);
   do{
      j--; 
   }while(a[j]>piv);
   if(a[i]<a[j])
   {
    int temp=a[i]; //swapping ith and jth index value
    a[i]=a[j];
    a[j]=temp;
   }
 }while(i<j);
 a[low]=a[j]; //swapping jth index value&pivot element
 a[j]=piv;
 return j;
 }
 static void quicksort(int a[],int low,int high)
{
  if(low<high)
  {
   int j=partition(a,low,high);
   quicksort(a,low,j);//recursive call for left of pivot
   quicksort(a,j+1,high);//recursive call for right of pivot
  }
}
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n+1];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
arr[n]=Integer.MAX_VALUE;
quicksort(arr,0,n);
for(int i=0;i<n;i++)
System.out.println(arr[i]);
	}
}
