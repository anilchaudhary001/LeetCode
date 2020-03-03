/*
Given two binary strings, return their sum (also a binary string).
The input strings are both non-empty and contains only characters 1 or 0.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
*/

// Runtime: 2 ms, faster than 77.75% of Java online submissions for Add Binary.
// Memory Usage: 38.5 MB, less than 5.62% of Java online submissions for Add Binary.
// solution:

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() == 0 && b.length() == 0) return "0";
        if (a.length() > b.length()) {
            int zeroes = a.length() - b.length();
            for (int i = 0; i < zeroes; i++) {
                b = "0" + b;
            }
        } else if (a.length() < b.length()) {
            int zeroes = b.length() - a.length();
            for (int i = 0; i < zeroes; i++) {
                a = "0" + a;
            }
        }

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        char[] cChar = new char[a.length()];
        char carry = '0';
        
        for (int i = a.length() - 1; i >= 0; i--) {
            if (aChar[i] == '1') {
                if (bChar[i] == '1') {
                    if (carry == '1') {
                        cChar[i] = '1';
                    } else {
                        cChar[i] = '0';
                        carry = '1';
                    }
                } else {
                    if (carry == '1') {
                        cChar[i] = '0';
                    } else {
                        cChar[i] = '1';
                        carry = '0';
                    }
                }
            } else {
                if (carry == '1') {
                    if (bChar[i] == '1') {
                        cChar[i] = '0';
                    } else {
                        cChar[i] = '1';
                        carry = '0';
                    }
                } else {
                    cChar[i] = bChar[i];
                }
            }
        }
        
        String s = new String(cChar);
        if (carry == '1') {
            s = "1" + s;
        }
        return s;
    }
}
