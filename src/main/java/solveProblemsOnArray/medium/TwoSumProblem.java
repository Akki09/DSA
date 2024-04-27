package solveProblemsOnArray.medium;

import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] input = new int[]{4, 1, 2, 3, 1};
        System.out.println(read(input.length, input, 5));
    }

    public static String read(int n, int[] book, int target) {
        // Write your code here.
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(book[i]);
            if (set.contains(target - book[i])) {
                return "YES";
            }
        }
        return "NO";
    }
}
