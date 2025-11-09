# 48. Rotate Image

You are given an n x n 2D matrix representing an image. Rotate the image by 90 degrees (clockwise) in-place.

Solving pattern and why:
- Use matrix transpose followed by reversing each row. This manipulates the array in-place with O(1) extra space and O(n^2) time.

Approach:
- Transpose: swap matrix[i][j] with matrix[j][i] for i<j.
- Reverse each row.
