package solveProblemsOnArray.hard;

import java.util.Arrays;

public class FindTheRepeatingAndMissingNumber {

    public static void main(String[] args) {
        int[] input = new int[]{10, 11, 1, 12, 3, 4, 13, 8, 2, 6, 7, 9, 5, 3};
        //int[] input = new int[]{8,4,1,6,7,2,5,8};
        int[] output = findMissingRepeatingNumbers(input);
        System.out.println(output[0] + "," + output[1]);
    }

    public static int[] findMissingRepeatingNumbers(int[] a) {
        // Write your code here
        Arrays.sort(a);
        int repeating = 0;
        int missing = 0;
        int i;
        for (i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                repeating = a[i];
            }
            if (a[i] - a[i - 1] > 1) {
                missing = a[i - 1] + 1;
            }
        }
        //if Missing is not found then missing will be 1 more than the last number
        return new int[]{repeating, missing == 0 ? a[i - 1] + 1 : missing};
    }
}
