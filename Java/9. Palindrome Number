/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

// Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
// Memory Usage: 40.2 MB, less than 5.02% of Java online submissions for Palindrome Number.
// 很有意思的一个Python解法：return str(x) == str(x)[::-1]

class Solution {
    public boolean isPalindrome(int num) {
        int res = 0;
        int num1 = num;
        while (num > 0) {
            res = res * 10 + (num % 10);
            num = num / 10;
        }
        return num1 == res;
    }
}
