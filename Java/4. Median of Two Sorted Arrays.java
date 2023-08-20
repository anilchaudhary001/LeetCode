/**
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

// Runtime: 2 ms, faster than 44.57% of Java online submissions for Median of Two Sorted Arrays.
// Memory Usage: 42.44 MB, less than 62.56% of Java online submissions for Median of Two Sorted Arrays.

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combineArray = Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, combineArray, nums1.length, nums2.length);

        Arrays.sort(combineArray);

        if (combineArray.length % 2 == 1) {
            return combineArray[combineArray.length / 2];
        } else {
            double result1 = combineArray[combineArray.length / 2];
            double result2 = combineArray[combineArray.length / 2 - 1];
            return (result1 + result2) / 2;
        }
    }
}
