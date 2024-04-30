package solveProblemsOnArray.hard;

import java.util.*;
import java.util.stream.Stream;

public class ThreeSumProblem {

    public static void main(String[] args) {
        int[] input = new int[]{-1, -1, 2, 0, 1};
        //int[] input = new int[]{-2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2};
        List<List<Integer>> triplet = triplet(input.length, input);
        for (List<Integer> uniqueTriplets : triplet) {
            System.out.print("[" + uniqueTriplets.get(0) + "," + uniqueTriplets.get(1) + "," + uniqueTriplets.get(2) + "]");
            System.out.println();
        }
    }

    //Below one is accepted but we will try to avoid extra space except ans
    // TC: O(n2) and SC: O(1)
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> output = new ArrayList<>();
        //1. Sort the array
        Arrays.sort(arr);

        //2. 3 pointers i,j,k
        int i;
        int j;
        int k;

        //3. i will be first point(j will be next element(diff from i), and k will be n-1 element)
        for (i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            j = i + 1;
            k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<>(Stream.of(arr[i], arr[j], arr[k]).toList());
                    output.add(triplet);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return output;
    }

    // Here we can reduce one log n of internal loop TC: O(n2)*log(unique Triplet) SC: 2* O(unique Triplet)
    // We will be using the hashing for last loop
//    public static List<List<Integer>> triplet(int n, int[] arr) {
//        List<List<Integer>> output = new ArrayList<>();
//        Set<List<Integer>> uniqueTriplet = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            // Create new hashing for new i
//            Set<Integer> tempHashing = new HashSet<>();
//            for (int j = i + 1; j < arr.length; j++) {
//                //arr[i] + arr[j] + arr[k] == 0
//                //arr[k] = -(arr[i] + arr[j])
//                int temp = -(arr[i] + arr[j]);
//                if (tempHashing.contains(temp)) {
//                    List<Integer> triplet = new ArrayList<>(Stream.of(arr[i], arr[j], temp).toList());
//                    Collections.sort(triplet);
//                    uniqueTriplet.add(triplet);
//                }
//                tempHashing.add(arr[j]);
//            }
//        }
//        for (List<Integer> triplet : uniqueTriplet) {
//            output.add(triplet);
//        }
//        return output;
//    }

    // TC: O(N3)*log(unique Triplet) and SC: 2* O(unique Triplet) (One For Set and One for Output)
//    public static List<List<Integer>> triplet(int n, int[] arr) {
//        List<List<Integer>> output = new ArrayList<>();
//        Set<List<Integer>> uniqueTriplet = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == 0) {
//                        List<Integer> triplet = new ArrayList<>(Stream.of(arr[i], arr[j], arr[k]).toList());
//                        Collections.sort(triplet);
//                        uniqueTriplet.add(triplet);
//                    }
//                }
//            }
//        }
//        for (List<Integer> triplet : uniqueTriplet) {
//            output.add(triplet);
//        }
//        return output;
//    }
}
