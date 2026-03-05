// Problem: Climbing Stairs (Easy) — LeetCode #70
// Link: https://leetcode.com/problems/climbing-stairs/
// Approach: Classic DP — same as Fibonacci. To reach step n,
//           you came from step n-1 or n-2.
// Time Complexity: O(n)
// Space Complexity: O(1)

class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
