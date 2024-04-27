package solveProblemsOnArray.easy;

import java.util.HashMap;
import java.util.Objects;

public class LongestPositiveAndNegativeSubArrays {
    public static void main(String[] args) {
        int[] input = new int[]{-1, 0, 1, 1, -1, -1, 0};
        System.out.println(getLongestSubarray(input, 0));
    }

    public static int getLongestSubarray(int[] nums, int k) {
        int ans = 0;
        long sum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                // i+1 because if it's happening for the first time later sum is going to increase
                // so it will not fall in this condition
                ans = Math.max(ans, i + 1);
            }

            long temp = sum - k;
            Integer index = map.get(temp);
            if (Objects.nonNull(index)) {
                ans = Math.max(ans, i - index);
            }
            //Handling the zeroes
            if (Objects.isNull(map.get(sum))) {
                map.put(sum, i);
            }
        }
        return ans;
    }
}
