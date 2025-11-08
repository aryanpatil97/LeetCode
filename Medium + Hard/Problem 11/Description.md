# 11. Container With Most Water

Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i are at (i, ai) and (i, 0).
Find two lines, which together with the x-axis forms a container, such that the container contains the most water.

Solving pattern and why:
- Two-pointers greedy: start at both ends and move the pointer at the shorter line inward.
- This is O(n) time and O(1) space; moving the shorter pointer can only potentially increase area, so it's safe.

Approach:
- Initialize left=0, right=n-1, compute area = min(height[left],height[right]) * (right-left), update max, then move the smaller pointer.
