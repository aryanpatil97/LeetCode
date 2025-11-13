Problem 2545 — Sort the Students by Their Kth Score

Short statement
Given a score matrix where score[i] are student scores across tests, sort the students by their k-th test score in descending order.

Approach
- Use stable sort with a comparator that compares the k-th column (descending).

Complexity
- Time: O(m log m) where m is number of students; Space: depends on language sort stability.

Edge cases
- Equal scores on k-th test — need stable ordering or tie-breaker.
