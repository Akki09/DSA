**Problem statement**

You are given an array ‘NUMS’ of length ‘N’. You are also given an integer ‘TARGET’.



Return an array of all the unique quadruplets [ ‘NUMS[ a ]’, ‘NUMS[ b ]’, ‘NUMS[ c ]’, ‘NUMS[ d ]’ ] with the following conditions:



i. 0 <= a, b, c, d < ‘N’ and a, b, c, and d are distinct.

ii. NUMS[ a ] + NUMS[ b ] + NUMS[ c ] +NUMS[ d ] = TARGET



Return the array in any order.



Note:


(NUMS[ a ], NUMS[ b ], NUMS[ c ], NUMS[ d ]), (NUMS[ a ], NUMS[ d ], NUMS[ c ], NUMS[ b ]), (NUMS[ a ], NUMS[ c ], NUMS[ b ], NUMS[ d ])... all of them are treated or considered the same quadruplets.



Two quadruplets are different if there is any integer in one quadruplet which is not in the other.



The solution will be verified by the number of valid quadruplets returned. In the output, only the number of valid quadruplets will be printed.



Example:
Input: ‘N’ = 5,  ‘TARGET’ = 5, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]

Output: 1.

There is only one unique quadruplet with sum = 5 and that is [1, 2, 1, 1].
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6 8
2 2 2 2 1 3
Sample Output 1 :
2
Explanation Of Sample Input 1:
(2+2+2+2) = (2+2+1+3) = 4.
Sample Input 2:
4 4
1 1 1 0
Sample Output 2 :
0
Constraints :
4 <= N <= 100
-10^6 <= NUMS[ i ] <= 10^6
-10^6 <= TARGET <= 10^6


Time Limit: 1 sec
