package solveProblemsOnArray.hard;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] input = new int[]{-2, 3, -4, 0};
        System.out.println(subarrayWithMaxProduct(input));
    }

    // Bruteforce approach TC: O(n2) and SC: O(1)
    public static int subarrayWithMaxProduct(int[] arr) {
        // Write your code here.
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]);
            int temp = arr[i];
            ans = Math.max(ans, temp);
            for (int j = i + 1; j < arr.length; j++) {
                temp = temp * arr[j];
                ans = Math.max(ans, temp);
            }
        }

        return ans;
    }
}
