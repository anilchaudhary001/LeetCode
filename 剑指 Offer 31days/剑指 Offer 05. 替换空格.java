/**
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."

限制：
0 <= s 的长度 <= 10000
*/

class Solution {
    public String replaceSpace(String s) {
        String str = s.replace(" ","%20");
        return str;
        // 更简单的
        // return s.replaceAll(" ","%20");
    }
}

// 这个不行，不能替换“     ”这种
// class Solution {
//     public String replaceSpace(String s) {
//         String[] str = s.split(" ");
//         String result = "";
//         for(int i = 0; i < str.length; i++) {
//             if (s.length() == 0) {
//                 return result;
//             } else if(i != str.length-1) {
//                 result += str[i] + "%20";
//             } else if (i != str.length) {
//                 result += str[i];
//             }
//         }
//         return result;
//     }
// }
