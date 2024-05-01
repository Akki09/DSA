**Problem statement**

School is organizing a team contest. You are given an array ‘SKILL’ containing the skill level of ‘N’ candidates.

Two candidates(having index ‘i’ and ‘j’) can pair up to form a team if for index i < j, SKILL[i] > 2*SKILL[j].

Your task is the return the count of all the possible pairs to take part in the contest.

Example:
Input: ‘N’ = 5
‘SKILL’ = [4, 1, 2, 3, 1]

Output: 3

Explanation:
Possible pairs are (4,1), (4,1), (3,1).

Detailed explanation

Sample Input 1:

5
4 1 2 3 1

Sample Output 1 :

3

Explanation Of Sample Input 1:

Possible pairs are (4,1), (4,1), and (3,1).

Sample Input 2:

4
100 49 201 100

Sample Output 2 :

2

Constraints:

1  <= N <= 10^5

1 <= SKILL[i] <= 10^6

Time Limit: 1 sec