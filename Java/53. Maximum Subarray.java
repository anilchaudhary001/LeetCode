/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


*/

// solution
// Runtime: 1 ms, faster than 79.90% of Java online submissions for Maximum Subarray.
// Memory Usage: 42 MB, less than 5.16% of Java online submissions for Maximum Subarray.

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int bestSum = nums[0];
        
        
        for (int i = 1; i < nums.length; i++) {
            if (currSum <= 0 && nums[i] > currSum) currSum = nums[i];
            else currSum += nums[i];
            
            if (currSum > bestSum) bestSum = currSum;
        }
        return bestSum;
    }
}
