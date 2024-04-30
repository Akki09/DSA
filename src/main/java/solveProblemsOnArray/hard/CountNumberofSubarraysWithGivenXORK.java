package solveProblemsOnArray.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountNumberofSubarraysWithGivenXORK {
    public static void main(String[] args) {
//        int[] input = new int[]{1, 2, 3, 2};
//        System.out.println(subarraysWithSumK(input, 2));
//        int[] input = new int[]{1, 2, 3, 3};
//        System.out.println(subarraysWithSumK(input, 3));

        int[] input = new int[]{1, 3, 3, 3, 5};
        System.out.println(subarraysWithSumK(input, 6));
    }

    public static int subarraysWithSumK(int[] a, int b) {
        // Write your code here
        //x^K(group of element) = XR
        //X^K^K = XR^K
        //**XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.**
        //**XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2**
        //X(XOR of the ELEMENT) = XR(Target)^K(Current XOR)

        int XOR = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            XOR = XOR ^ a[i];
            int x = b ^ XOR;
            if (map.containsKey(x)) {
                count += map.get(x);
            }
            //Store the XOR
            if (map.containsKey(XOR)) {
                map.put(XOR, map.get(XOR) + 1);
            } else {
                map.put(XOR, 1);
            }
        }

        return count;
    }
}
