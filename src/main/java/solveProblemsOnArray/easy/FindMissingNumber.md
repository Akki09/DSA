**XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.**

**XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2**



Now, let’s XOR all the numbers between 1 to N.
xor1 = 1^2^.......^N

**Let’s XOR all the numbers in the given array.
xor2 = 1^2^......^N (contains all the numbers except the missing one).**

**Now, if we again perform XOR between xor1 and xor2, we will get:
xor1 ^ xor2 = (1^1)^(2^2)^........^(missing Number)^.....^(N^N)**

Here all the numbers except the missing number will form a pair and each pair will result in 0 according to the XOR property. The result will be = 0 ^ (missing number) = missing number (according to property 2).

So, if we perform the XOR of the numbers 1 to N with the XOR of the array elements, we will be left with the missing number.