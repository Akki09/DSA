package solveProblemsOnArray.hard;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        long[] input1 = new long[]{1, 8, 8};
        long[] input2 = new long[]{2, 3, 4, 5};
        System.out.println("-------------Before-------------");
        for (long i : input1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (long i : input2) {
            System.out.print(i + " ");
        }
        mergeTwoSortedArraysWithoutExtraSpace(input1, input2);
        System.out.println("\n-------------After-------------");
        for (long i : input1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (long i : input2) {
            System.out.print(i + " ");
        }
    }

    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        // Write your code here.
        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (a[i] < b[j] || a[i] == b[j]) {
                i++;
            } else {
                swap(a, b, i, j);
                Arrays.sort(b);
                i++;
            }
        }
    }

    private static void swap(long[] a, long[] b, int i, int j) {
        long temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
