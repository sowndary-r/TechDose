/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  ArrayList<Integer> list=new ArrayList<Integer>();
 int idx=0;
 double res;
 for(int i=0;i<nums1.length;i++)
   list.add(nums1[i]);
 for(int i=0;i<nums2.length;i++)
   list.add(nums2[i]); 
 Collections.sort(list);
    idx=list.size()/2;
   if(list.size()%2!=0)
   {  res=list.get(idx); 
      System.out.print("odd");}
   else 
    { res=(double)((list.get(idx-1)+list.get(idx))/2.0); 
    System.out.print("even");}
        return res;
    }
}
//Time complexity - O(NlogN)
