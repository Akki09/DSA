**Problem statement**

You are given an array ‘a’ of ‘n’ integers.

You have to return the lexicographically next to greater permutation.

Note:
If such a sequence is impossible, it must be rearranged in the lowest possible order.

Example:
Input: 'a' = [1, 3, 2]

Output: 2 1 3

Explanation: All the permutations of [1, 2, 3] are [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1], ]. Hence the next greater permutation of [1, 3, 2] is [2, 1, 3].

Detailed explanation
Sample Input 1:
3
3 1 2

Sample Output 1:
3 2 1

Explanation Of Sample Input 1:
Input:
A = [3, 1, 2]
Output:
3 2 1

Explanation: All the permutations of [1, 2, 3] are [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1], ]. Hence the next greater permutation of [3, 1, 2] is [3, 2, 1].

Sample Input 2:
3
3 2 1

Sample Output 2:
1 2 3

Constraints:
1 <= n <= 100
1 <= a[ i ] <= 100
Time Limit: 1 sec
