package solveProblemsOnArray.easy;

import java.util.ArrayList;
import java.util.List;

public class FindTheUnion {

    public static void main(String[] args) {
        int[] input1 = new int[]{3, 5, 6, 7, 8};
        int[] input2 = new int[]{2, 4, 5, 6, 7, 8, 8, 8, 9};

        List<Integer> integers = sortedArray(input1, input2);
        integers.forEach(System.out::print);
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int aSize = a.length;
        int bSize = b.length;
        int i = 0;
        int j = 0;
        List<Integer> sortedList = new ArrayList<>();
        while (i < aSize && j < bSize) {

            if (a[i] == b[j]) {
                sortedList.add(a[i]);
                i++;
                j++;
                while (i < aSize && a[i] == a[i - 1]) {
                    i++;
                }
                while (j < bSize && b[j] == b[j - 1]) {
                    j++;
                }
                continue;
            }
            if (a[i] < b[j]) {
                sortedList.add(a[i]);
                i++;
                while (i < aSize && a[i] == a[i - 1]) {
                    i++;
                }
                continue;
            }
            if (b[j] < a[i]) {
                sortedList.add(b[j]);
                j++;
                while (j < bSize && b[j] == b[j - 1]) {
                    j++;
                }
                //continue; as it's end of the loop so not require
            }

        }

        while (i < aSize) {
            sortedList.add(a[i]);
            i++;
            while (i < aSize && a[i] == a[i - 1]) {
                i++;
            }
        }
        while (j < bSize) {
            sortedList.add(b[j]);
            j++;
            while (j < bSize && b[j] == b[j - 1]) {
                j++;
            }
        }
        return sortedList;

    }
}
