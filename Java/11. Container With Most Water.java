/**
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
**/

/**
solution 1 双指针
执行用时：4 ms, 在所有 Java 提交中击败了58.77%的用户
内存消耗：51.1 MB, 在所有 Java 提交中击败了95.64%的用户
通过测试用例：61 / 61
**/

class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (rightPointer > leftPointer) {
            int currentArea = (rightPointer - leftPointer) * Math.min(height[rightPointer], height[leftPointer]);
            result = Math.max(currentArea, result);
            if (height[rightPointer] > height[leftPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        
        return result;
    }
}
