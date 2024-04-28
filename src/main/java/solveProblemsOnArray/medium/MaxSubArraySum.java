package solveProblemsOnArray.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSubArraySum {
    public static void main(String[] args) {

        //int[] input = new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1};
        int[] input = new int[]{-3,-5-8};
        //int[] input = new int[]{10, 20, -30, 40, -50, 60};
        System.out.println(maxSubarraySum(input, input.length));
    }

    public static long maxSubarraySum(int[] arr, int n) {
        int sum = 0;
        int max = Integer.MIN_VALUE ;
        for (int j : arr) {
            sum += j;
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return Math.max(max, 0);
    }

    //Brutforce Approach
//    public static long maxSubarraySum(int[] arr, int n) {
//        // write your code here
//        // Instead of sums we could take simple int max and use it
//        List<Integer> sums = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                sums.add(sum);
//            }
//        }
//
//        return Collections.max(sums);
//    }
}
