/**
在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

示例 1:
输入：s = "abaccdeff"
输出：'b'

示例 2:
输入：s = "" 
输出：' '
*/

class Solution {
    public char firstUniqChar(String s) {
        if (s.length() == 0) { return ' '; }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
        }
        for(int j = 0; j < s.length(); j++) {
            if(map.get(s.charAt(j)) == 1) {
                return s.charAt(j);
            }
        }
        return ' ';
    }
}
