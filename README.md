# <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="32"/> LeetCode Solutions in Java

<p align="center">
  <a href="https://github.com/taniy8"><img src="https://img.shields.io/badge/Language-Java-007396?style=for-the-badge&logo=java&logoColor=white"/></a>
  <a href="https://leetcode.com/u/TaniyaSaxena/"><img src="https://img.shields.io/badge/LeetCode-TaniyaSaxena-1a1a2e?style=for-the-badge&logo=leetcode&logoColor=white"/></a>

</p>

A structured collection of LeetCode solutions written in Java. Every solution includes a clear explanation of the approach and complexity analysis — because understanding the *why* matters more than just passing the test.

---

## What You'll Find Here

- [x] Clean, well-commented Java code
- [x] Approach explained in plain English for every problem
- [x] Time and Space complexity on every solution
- [x] Organized by topic — not just dumped in one folder

---

## Topics

| Topic | Key Patterns |
|-------|-------------|
| [Arrays](./arrays/) | Two pointers, sliding window, prefix sum |
| [Strings](./strings/) | HashMap, sliding window, palindrome |
| [Trees](./trees/) | DFS, BFS, recursion, level order |
| [Graphs](./graphs/) | DFS, BFS, topological sort, union find |
| [Dynamic Programming](./dynamic-programming/) | Memoization, tabulation, state design |
| [Sorting](./sorting/) | Merge sort, quick select, counting sort |
| [Linked Lists](./linked-lists/) | Fast/slow pointers, reversal, merge |
| [Stack & Queue](./stack-queue/) | Monotonic stack, deque, min stack |
| [Binary Search](./binary-search/) | Search space reduction, rotated arrays |
| [Math](./math/) | Number theory, bit manipulation, GCD |

---

## Solution Format

Every file follows this structure:

```java
// Problem: Two Sum (Easy) — LeetCode #1
// Link: https://leetcode.com/problems/two-sum/
// Approach: Store each number's complement in a HashMap.
//           On each iteration, check if the complement already exists.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## How I Approach Problems

```
1. READ     ->  Understand fully before touching the keyboard
2. BRUTE    ->  Naive solution first — get it working
3. PATTERN  ->  Sliding window? DP? Graph traversal? Find it.
4. OPTIMIZE ->  Reduce time and space, justify every step
5. CODE     ->  Clean implementation with meaningful names
6. PUSH     ->  Daily commit. Consistency over everything.
```

---

## Connect

[![GitHub](https://img.shields.io/badge/GitHub-taniy8-181717?style=flat-square&logo=github)](https://github.com/taniy8)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Taniya%20Saxena-0A66C2?style=flat-square&logo=linkedin)](https://linkedin.com/in/taniya-saxena-511524330)
[![LeetCode](https://img.shields.io/badge/LeetCode-TaniyaSaxena-1a1a2e?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/TaniyaSaxena)

---

<p align="center">If this repo helped you in any way, a star would mean a lot ⭐</p>
