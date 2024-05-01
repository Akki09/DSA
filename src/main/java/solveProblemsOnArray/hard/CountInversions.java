package solveProblemsOnArray.hard;

import java.util.ArrayList;

public class CountInversions {


    public static void main(String[] args) {

        int[] input = new int[]{4, 3, 2, 1};
        //System.out.println(numberOfInversions(input, input.length));
        System.out.println(sortThis(input, 0, input.length - 1));
    }


    // Optimal approach using the mergeSort TC: O(NLogN) and SC: O(N) (TempArray)
    private static int sortThis(int[] input, int startIndex, int endIndex) {
        int maxPair = 0;
        //base condition
        if (startIndex >= endIndex) {
            return maxPair;
        }
        int mid = (startIndex + endIndex) / 2;
        maxPair += sortThis(input, startIndex, mid);
        maxPair += sortThis(input, mid + 1, endIndex);
        maxPair += mergeThis(input, startIndex, mid, endIndex);
        return maxPair;
    }

    private static int mergeThis(int[] input, int startIndex, int mid, int endIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        int leftPointer = startIndex;
        int rightPointer = mid + 1;
        int count = 0;

        while (leftPointer <= mid && rightPointer <= endIndex) {
            if (input[leftPointer] <= input[rightPointer]) {
                list.add(input[leftPointer]);
                leftPointer++;
            } else {
                count += (mid - leftPointer + 1);
                list.add(input[rightPointer]);
                rightPointer++;
            }
        }

        //for remaining pointers
        while (leftPointer <= mid) {
            list.add(input[leftPointer]);
            leftPointer++;
        }

        while (rightPointer <= endIndex) {
            list.add(input[rightPointer]);
            rightPointer++;
        }

        // populate back in input
        int tempIndex = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            input[i] = list.get(tempIndex);
            tempIndex++;
        }

        //return maxpair
        return count;
    }

    // Bruteforce Approach TC: O(N2) and SC: O(1)
//    public static int numberOfInversions(int[] a, int n) {
//        // Write your code here.
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (a[i] > a[j]) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }
}
