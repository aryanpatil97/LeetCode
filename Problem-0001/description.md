# 1. Two Sum

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**
# Problem 1 — Two Sum

## Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`. Each input has exactly one solution, and you may not use the same element twice.

## Constraints
- $2 \le nums.length \le 10^4$
- $-10^9 \le nums[i] \le 10^9$
- $-10^9 \le target \le 10^9$
- Exactly one valid answer exists

## Examples
**Input:** `nums = [2,7,11,15], target = 9`

**Output:** `[0,1]`

## Approach
Use a hash map to store each value with its index as you scan the array.
- For each number, check whether `target - num` is already in the map
- If found, return the pair of indices

## Complexity
- Time: $O(n)$
- Space: $O(n)$