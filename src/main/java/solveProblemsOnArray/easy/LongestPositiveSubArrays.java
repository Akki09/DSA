package solveProblemsOnArray.easy;

import java.util.HashMap;
import java.util.Objects;

public class LongestPositiveSubArrays {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 1, 1, 1, 1, 3, 3};
        //int[] input = new int[]{-1, 0, 1, 1, -1, -1, 0};
        //System.out.println(longestSubarrayWithSumK(input, 0));


        System.out.println(longestSubarrayWithSumK(input, 6));
    }

    //Optimal approach with Double Pointer (if no zeros and negative number are there)
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int sum = 0;
        int ans = 0;
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            while (sum > k) {
                sum -= a[j];
                j++;
            }
            if (sum == k) {
                ans = Math.max(ans, i - j + 1);
            }
        }
        return ans;
    }


    // Better Approach with HASHING (Take care of 0 and negative number by not adding in hashmap if sum is already present) TC = O(nlogN) logN is for hashing
//    public static int longestSubarrayWithSumK(int[] a, long k) {
//        int ans = 0;
//        long sum = 0;
//        HashMap<Long, Integer> map = new HashMap<>();
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            if (sum == k) {
//                // i+1 because if it's happening for the first time later sum is going to increase
//                // so it will not fall in this condition
//                ans = Math.max(ans, i + 1);
//            }
//
//            long temp = sum - k;
//            Integer index = map.get(temp);
//            if (Objects.nonNull(index)) {
//                ans = Math.max(ans, i - index);
//            }
//            //Handling the zeroes
//            if (Objects.isNull(map.get(sum))) {
//                map.put(sum, i);
//            }
//        }
//        return ans;
//    }

//    // BrutForce Approach with TC = O(n2)
//    public static int longestSubarrayWithSumK(int[] a, long k) {
//
//        int ans = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            int sum = 0;
//            for (int j = i; j < a.length; j++) {
//                sum += a[j];
//                // For Summation
//                if (sum == k) {
//                    ans = Math.max(ans, j - i + 1);
//                    break;
//                }
//                if (sum > k) {
//                    break;
//                }
//            }
//        }
//        return ans;
//    }

//    // BrutForce Approach with TC = O(n3)
//    public static int longestSubarrayWithSumK(int[] a, long k) {
//
//        int ans = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length; j++) {
//                int sum = 0;
//                // For Summation
//                for (int l = i; l <= j; l++) {
//                    sum += a[l];
//                }
//                if (sum == k) {
//                    ans = Math.max(ans, j - i + 1);
//                    break;
//                }
//                if (sum > k) {
//                    break;
//                }
//            }
//        }
//        return ans;
//    }

//    public static int longestSubarrayWithSumK(int[] a, long k) {
//        // Write your code here
//        //2nd Pointer
//        int j = 0;
//        int sum = 0;
//        int maxSubArraySize = 0;
//
//        //loop over the array
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            while (sum > k) {
//                sum = sum - a[j];
//                j++;
//            }
//            if (sum == k) {
//                int subArraySize = i - j + 1;
//                if (maxSubArraySize < subArraySize) {
//                    maxSubArraySize = subArraySize;
//                }
//            }
//        }
//        return maxSubArraySize;
//    }
}
