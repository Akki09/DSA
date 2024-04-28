package solveProblemsOnArray.medium;

import java.util.ArrayList;
import java.util.stream.Stream;

import static java.util.Collections.swap;

public class SortArraysOf012 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Stream.of(2, 2, 2, 2, 0, 0, 1, 0).toList());
        sortArray(list, list.size());
        list.forEach(System.out::print);
    }

    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        // Dutch National Flag Algorithm
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

}
