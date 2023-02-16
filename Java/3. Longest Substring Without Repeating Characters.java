/*
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

示例 2:
输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

示例 3:
输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/

// solution(暂存，922 / 987):
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ") || s.length() == 1) {
            return 1;
        }

        List<String> ableList = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++) {
            char firstChar = s.charAt(i);
            int endCharIndex = 0;
            String uniqueString = "";
            if(i != s.length()) {
                for(int j = i + 1; j < s.length(); j++) {
                    uniqueString = s.substring(i, j);
                    if(uniqueString.contains(String.valueOf(s.charAt(j)))) {
                        endCharIndex = j;
                        break;
                    }
                }
            }
            if(endCharIndex != 0) {
                String ableString = s.substring(i, endCharIndex);
                ableList.add(ableString);
            }
        }

        if(ableList.size() == 0 && s.length() != 0) {
            return s.length();
        }

        int resultLength = 0;
        for(int i = 0; i < ableList.size(); i++) {
            if(ableList.get(i).length() > resultLength) {
                resultLength = ableList.get(i).length();
            }
        }
        return resultLength;
    }
}
