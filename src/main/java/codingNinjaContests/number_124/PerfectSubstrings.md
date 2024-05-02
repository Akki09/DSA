Perfect Substrings
Hard
16.8/120
Average time to solve is 55m


**Problem statement**


You are given a string ‘S’ of length ‘N’ where each character is numbered from ‘0’ to ‘N - 1’. A string ‘T’ is considered to be a perfect string if it satisfies the following conditions:

‘T’ is a concatenation of ‘3’ strings, where the first string should be equal to the last string.
You can write ‘T’ as:(‘S1’ + ‘S2’ + ‘S1’), where ‘S1’ and ‘S2’ are two non-empty strings which may or may not be equal.
For example: “abbghiabb”, is a perfect string because you can write it as: (“abb” + “ghi” + “abb”).
You will be given an array ‘Queries’ which stores ‘Q’ queries of type ‘(L, R)’. You have to tell whether the substring from ‘L’ to ‘R’ is perfect or not.

Your task is to answer all the queries and return an array of ‘1’s and ‘0’s where ‘1’ means the substring is perfect and ‘0’ means the substring is not perfect.

Example:
‘N’ = 11
‘S’ = “acdafkbgb”
‘Q’ = 1
‘Queries’ = [[0, 3]]

Here, you have to check whether “acda” is perfect or not. You can write “acda” as: “a” + “cd” + “a”, which satisfies the criteria of perfect string.
So the answer for this example is: [1].

**Detailed explanation**

The first input line contains a single integer 'T' , which denotes the number of test cases. 

Then,'T' test cases follow. For each test case:

The first line contains a single integer ‘N’ , denoting the length of the string ‘S’.

The following line contains ‘N’ lowercase characters denoting the elements
of the string ‘S’.

The next line contains a single integer ‘Q’ denoting the number of queries.

The next ‘Q’ line contains two space separated integers ‘L’ and ‘R’ specifying
the queries.

**Output Format:**

For each test case, output the array as described above.

**Note:**
You don’t need to print anything. Just implement the given function


Constraints:
1 <= 'T' <= 10
1 <= 'N' <= 5000
‘a’ <= ‘S[i]’ <= ‘z’
1 <= ‘Q’ <= 10^6
0 <= ‘Queries[i][0]’ <= ‘Queries[i][1]’ <= ‘N - 1’.

Time Limit: 1 sec
Sample Input 1:
2
13
abaabacefffcd
2
0 4
8 10
3
klo
1
2 2
Sample Output 1:
1 1
0
Explanation of sample input 1:
For test case 1:
‘1st’ query is “abaab”. You can write it as: “ab” + “a” + “ab” which follows the criteria of perfect string.

‘2nd’ query is “fff”. You can write it as: “f” + “f” + “f” which also satisfies the criteria of perfect string.

So, the answer for this test case is: [1, 1].

For test case 2:

Here we have only one query: “o”. It is not a perfect string.

So, the answer for this test case is: [0].
Sample Input 2:
2
10
zbaczbakkk
3
1 3
0 2
1 6
18
aaabbbcccdddeeefff
2
0 2
3 5
Sample Output 2:
0 0 1
1 1