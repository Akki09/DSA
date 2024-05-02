**Battle Begins**

Easy
40/40
Average time to solve is 10m
Problem statement
There is a number line where points are numbered from ‘0’ to infinity. There are also two players Alice and Bob, where Alice is currently present at point ‘X’ and Bob is currently present at point ‘Y’.



In each iteration of the game, Alice moves ‘A’ steps right and Bob moves ‘B’ steps left. More formally, if Alice is present at some point ‘P’, she’ll move to point ‘(P + A), and if Bob is present at some point ‘Q’, he’ll move to point ‘(Q - B)’.



You have to determine whether both the players meet at the same point after some iterations.



Your task is to tell whether Alice and Bob can meet at the same point after some iterations of the game. Return ‘1’, if possible, otherwise return ‘0’.

Example:
‘X’ = 2
‘Y’ = 8
‘A’ = 2
‘B’ = 1

During the first iteration of the game, Alice will move from ‘2’ to ‘4’ and Bob will move from ‘8’ to ‘7’.

During the second iteration of the game, Alice will move from ‘4’ to ‘6’ and Bob will move from ‘7’ to ‘6’.

Now, both the players are present at the same point after two iterations. So, the answer for this example is ‘1’.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= 'T' <= 10
0 <= ‘X’, ‘Y’ <= 10^9
1 <= ‘A’, ‘B’ <= 10^9

Time Limit: 1 sec 
