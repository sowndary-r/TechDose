//Approach: quick select algorithm
//time complexity: best case: O(N) 

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }
    private int quickSelect(int[] nums, int start, int end, int k) {
        int pivot = end;
        int i= start;
        int j = end - 1;
        while (i <= j) {
            if (nums[i] > nums[pivot]) {
         int t=nums[i];
         nums[i]=nums[j];
         nums[j]=t;
               j--;
            } 
     else 
           i++;
        }

       int temp=nums[i];
       nums[i]=nums[pivot];
       nums[pivot]=temp;

        int r = nums.length - i;
        if (r == k) return nums[i];
        if (r > k) return quickSelect(nums, i + 1, end, k);

        return quickSelect(nums, start, i - 1, k);

    }

    

}
