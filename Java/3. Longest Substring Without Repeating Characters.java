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

/*
solution 1 暴力破解
执行结果：
执行用时：178 ms, 在所有 Java 提交中击败了5.69%的用户
内存消耗：46.4 MB, 在所有 Java 提交中击败了5.04%的用户
通过测试用例：
987 / 987
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ") || s.length() == 1) {
            return 1;
        }

        List<String> ableList = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++) {
            int endCharIndex = 0;
            if(i != s.length()) {
                for(int j = i + 1; j < s.length(); j++) {
                    if(s.substring(i, j).contains(String.valueOf(s.charAt(j)))) {
                        endCharIndex = j;
                        break;
                    }
                    if(endCharIndex == 0) {
                        endCharIndex = s.length();
                    }
                }
            }
            if(endCharIndex != 0) {
                ableList.add(s.substring(i, endCharIndex));
            }
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

/*
solution 2 
执行结果：
执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
内存消耗：41.5 MB, 在所有 Java 提交中击败了63.17%的用户
通过测试用例：987 / 987
*/
class Solution {
	public int lengthOfLongestSubstring(String s) {
		int i = 0;
		int flag = 0;
		int length = 0;
		int result = 0;
		while (i < s.length()) {
			int pos = s.indexOf(s.charAt(i),flag);
			if (pos < i) {
				if (length > result) {
					result = length;
				}
				if (result >= s.length() - pos - 1) {
					return result;
				}
				length = i - pos - 1;
				flag = pos + 1;
			}
			length++;
			i++;
		}
		return length;
	}
}
