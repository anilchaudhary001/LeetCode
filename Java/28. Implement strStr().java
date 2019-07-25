/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -128. Implement strStr()
*/

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
// Memory Usage: 37.6 MB, less than 69.90% of Java online submissions for Implement strStr().

// solution(从i到i+needle的长度，substring一下查找i):

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() == 0 && needle.length() == 0) {
            return 0;
        } 
        else if (needle.length() == 0) {
            return 0;
        } 
        else if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                if(haystack.substring(i, (i+needle.length())).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}


// plus: find a very very interesting and simplest solution. 
class Solution {
    public int strStr(String haystack, String needle) {
        int i = haystack.indexOf(needle);
        return i;
    }
}
