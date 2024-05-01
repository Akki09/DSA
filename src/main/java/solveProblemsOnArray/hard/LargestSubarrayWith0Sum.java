package solveProblemsOnArray.hard;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {

    public static void main(String[] args) {
        //int[] input = new int[]{1, -1, 0, 0, 1};
        int[] input = new int[]{19, 0, 32, 49, 21, 25, 23, 31, 20, 5, 50, 49, 9, 44, 10, 13, 3, 31, 48, 22, -1};
        System.out.println(getLongestZeroSumSubarrayLength(input));
    }

    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.
        int sum = 0;

        //HERE our target is 0 so doing this way
        int target = 0;
        int ans = 0;

        // Stor the sum and it's index value for lookup
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                ans = Math.max(ans, i + 1);
            }
            int temp = sum - target;
            if (map.containsKey(temp)) {
                int index = map.get(temp);
                ans = Math.max(ans, i - index);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
