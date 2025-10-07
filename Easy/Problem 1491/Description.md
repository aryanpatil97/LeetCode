# 1491. Average Salary Excluding the Minimum and Maximum Salary

Given an array salary, return the average salary excluding the minimum and maximum salary.

**Example 1:**
```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
```

**Constraints:**
- 3 <= salary.length <= 100
- 1000 <= salary[i] <= 10^6

**Approach:**
- Find min and max, sum all, subtract min and max, divide by (n-2).