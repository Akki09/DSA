package solveProblemsOnArray.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementGreaterThanHalfOfN {
    public static void main(String[] args) {
        //int[] input = new int[]{2, 2, 1, 3, 1, 1, 3, 1, 1};
        //int[] input = new int[]{2, 2, 1, 3, 1, 1, 3, 1, 1,0,0}; //-1 will be return in this case
        int[] input = new int[]{-53, 75, 56, 56, 56};
        System.out.println(majorityElement(input));

    }

    //Optimal Approach
    //Moore's Voting algorithm O(N) + O(N)
    public static int majorityElement(int[] v) {
        int ele = v[0];
        int count = 1;
        // Find the element
        for (int i = 1; i < v.length; i++) {
            if (count == 0) {
                ele = v[i];
                count = 1;
            }
            if (v[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        //Verify
        int verifyCount = 0;
        for (int i : v) {
            if (i == ele) {
                verifyCount++;
            }
            if (verifyCount > v.length / 2) {
                return ele;
            }
        }
        return -1;
    }


    // Better Approach with O(NlogN) + (O(N))//this is worst case if we have all unique
//    public static int majorityElement(int[] v) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : v) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i) + 1);
//            } else {
//                map.put(i, 1);
//            }
//        }
//
//        Integer key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
//
//        return map.get(key) > (v.length / 2) ? key : -1;
//    }

    //BrutForce approach Time complexity of O(n2)
//    public static int majorityElement(int[] v) {
//        // Write your code here
//        for (int i : v) {
//            int count = 0;
//            for (int j : v) {
//                if (i == j) {
//                    count++;
//                }
//            }
//            if (count > (v.length / 2)) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
