package solveProblemsOnArray.medium;

import java.util.*;

public class MaxSubArraySumPrintArray {

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1};
        //int[] input = new int[]{10,20,-30,40,-50,60};
        //int[] input = new int[]{-3,-5,-6};
        int[] ints = maxSubarraySumArray(input, input.length);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    public static int[] maxSubarraySumArray(int[] arr, int n) {
        int sum = 0;
        int max = arr[0];
        int startIndex = 0;
        int endIndex = 0;
        for (int i= 0; i<n; i++) {
            sum += arr[i];
            if (sum < 0) {
                startIndex = i+1;
                sum = 0;
            }
            if(max<sum){
                max = sum;
                endIndex = i;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = startIndex; k <= endIndex; k++) {
            list.add(arr[k]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    //Brutforce Approach

//    public static int[] maxSubarraySumArray(int[] arr, int n) {
//        // write your code here
//        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                HashMap<Integer, Integer> temp = new HashMap<>();
//                temp.put(j, i);
//                map.put(sum, temp);
//            }
//        }
//
//        HashMap<Integer, Integer> max = Collections.max(map.entrySet(), Map.Entry.comparingByKey()).getValue();
//        int count = 0;
//        int startIndex = 0;
//        int endIndex = 0;
//        for (Map.Entry<Integer, Integer> integerIntegerEntry : max.entrySet()) {
//            count++;
//            startIndex = integerIntegerEntry.getValue();
//            endIndex = integerIntegerEntry.getKey();
//            break;
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int k = startIndex; k <= endIndex; k++) {
//            list.add(arr[k]);
//        }
//
//        return list.stream().mapToInt(i -> i).toArray();
//
//    }

}
