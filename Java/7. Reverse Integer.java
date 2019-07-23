/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/
// Runtime: 1 ms
// Memory Usage: 33.7 MB
// solution(一位一位导): 

class Solution {
    public int reverse(int x) {
        int result = 0;
        
        while(x != 0){
            if(Math.abs(result) > Integer.MAX_VALUE /10) 
                return 0;
            result *= 10;
            result += x % 10;
            x /= 10;
        }
        return result;
    }
}
