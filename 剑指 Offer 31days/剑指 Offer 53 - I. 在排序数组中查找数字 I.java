/**
统计一个数字在排序数组中出现的次数。

示例 1:
输入: nums = [5,7,7,8,8,10], target = 8
输出: 2

示例 2:
输入: nums = [5,7,7,8,8,10], target = 6
输出: 0
 
提示：

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums 是一个非递减数组
-109 <= target <= 109
*/

// 解题1：暴力拆解，没有用到有序这个条件
// 过一遍循环，用一个变量计数。
// 时间复杂度O(n), 空间复杂度O(1)
class Solution {
    public int search(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                result++;
            }
        }
        return result;
    }
}

// 解题2：二分查找
// 时间复杂度O(logn), 空间复杂度O(1)
