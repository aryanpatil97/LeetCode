# 860. Lemonade Change

At a lemonade stand, each lemonade costs $5. Customers are standing in a queue and buy one at a time, paying with $5, $10, or $20 bills. Return true if you can provide correct change to every customer.

**Example 1:**
```
Input: bills = [5,5,5,10,20]
Output: true
```

**Constraints:**
- 1 <= bills.length <= 10^5
- bills[i] is 5, 10, or 20

**Approach:**
- Track the number of $5 and $10 bills, give change greedily.