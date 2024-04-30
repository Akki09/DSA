package solveProblemsOnArray.hard;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static void main(String[] args) {
        int[] input = new int[]{1, -1, 0, 0, 1};
        System.out.println(getLongestZeroSumSubarrayLength(input));
    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        //Sum and index we will store and duplicate values will be not stored
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                ans = Math.max(ans, i);
            } else {
                if (map.containsKey(-(sum))) {
                    int temp = map.get(-(sum));
                    ans = Math.max(ans, i - temp + 1);
                }
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
            }
        }
        return ans;
    }
}
