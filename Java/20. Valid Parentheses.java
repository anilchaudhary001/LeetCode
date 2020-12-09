/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: s = "([)]"
Output: false

Example 5:
Input: s = "{[]}"
Output: true
*/

// solution1: only Stack, check left & right
// step: check length, if length % = 1, return false. Create stack.
// 

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            // push left part in to stack
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                // remember check empty. or will cause error. EmptyStackException
                if (stack.empty()) {
                    return false;
                }
                char preChar = stack.peek();
                if ((preChar == '(' && character == ')') || (preChar == '[' && character == ']') || (preChar == '{' && character == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}


// solution2: HashMap & Stack(or Deque)
// Runtime: 2 ms
// Memory Usage: 34.2 MB
// solution: (加入Map)

class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                if(stack.empty()||stack.pop() != map.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        
        return stack.empty();
    }
}
