**Problem statement**

You are given an array ‘ARR’ containing ‘N’ integers.



Return all the unique triplets [ARR[i], ARR[j], ARR[k]] such that i != j, j != k and k != i and their sum is equal to zero.



Example:
Input: ‘N’ = 5
'ARR' =  [-1, -1, 2, 0, 1]

Output:
-1 -1 2
-1 0 1

Explanation:
(-1 -1 +2) = (-1 +0 +1) = 0.

Detailed explanation

Sample Input 1:

5
-1 -1 2 0 1

Sample Output 1 :

-1 -1 2
-1 0 1

Explanation Of Sample Input 1:

(-1 -1 +2) = (-1 +0 +1) = 0.

Sample Input 2:

4
0 0 0 0

Sample Output 2 :

0 0 0

Constraints:

1  <= N <= 1000
1 <= ARR[i] <= 1000
Time Limit: 1 sec