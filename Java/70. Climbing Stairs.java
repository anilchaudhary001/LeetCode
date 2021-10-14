/*
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.

Example 1:
Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/

// solution: Dynamic Programmig
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 35.1 MB, less than 72.05% of Java online submissions for Climbing Stairs.

class Solution {
    public int climbStairs(int n) {
        Map<Integer,Integer> cache = new HashMap<>();
        if(n == 0) return 0; 
        if(n == 1) return 1;
        if(n == 2) return 2;
        cache.put(0, 0);
        cache.put(1, 1);
        cache.put(2, 2);
        for(int i = 3; i <= n; i++) {
            cache.put(i, cache.get(i - 1) + cache.get(i - 2));
        }
        return cache.get(n);
    }
}
