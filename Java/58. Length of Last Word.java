/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:
Input: "Hello World"
Output: 5
*/

// Runtime: 1 ms, faster than 42.75% of Java online submissions for Length of Last Word.
// Memory Usage: 38.1 MB, less than 7.57% of Java online submissions for Length of Last Word.
// solution: 把string空格分开成array

class Solution {
    public int lengthOfLastWord(String s) {
        String[] snew = s.split(" ");
        if (snew.length == 0) {
            return 0;
        } else {
            return snew[snew.length - 1].length();
        }
    }
}
