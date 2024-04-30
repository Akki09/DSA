package solveProblemsOnArray.hard;

import java.util.*;
import java.util.stream.Stream;

public class FourSumProblem {
    public static void main(String[] args) {
        int[] input = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> quadruplets = fourSum(input, 0);
        for (List<Integer> uniqueQuadruplets : quadruplets) {
            System.out.print("[" + uniqueQuadruplets.get(0) + "," + uniqueQuadruplets.get(1) + "," + uniqueQuadruplets.get(2) + "," + uniqueQuadruplets.get(3) + "]");
            System.out.println();
        }
    }

    //Using 4 pointer we will try to reduce the SC
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // Write your code here.
        //1.Sort the Array
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> output = new ArrayList<>();

        //2. 4 Pointers i, j, k, l
        int i = 0, j, k, l;

        //3. i will be pointing 0th index(Fix), j will be pointing 1st index(Fix)
        // (k will be next element of j, and l will be n-1 element)
        while (i < n) {
            j = i + 1;
            while (j < n) {
                k = j + 1;
                l = n - 1;
                while (k < l) {
                    int temp = nums[i] + nums[j] + nums[k] + nums[l];
                    if (temp == target) {
                        ArrayList<Integer> quadruplet = new ArrayList<>(Stream.of(nums[i], nums[j], nums[k], nums[l]).toList());
                        output.add(quadruplet);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (temp < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
                j++;
                while (j < n && nums[j] == nums[j - 1]) {
                    j++;
                }
            }
            i++;
            while (i < n && nums[i] == nums[i - 1]) {
                i++;
            }
        }

        return output;
    }

    // Reduce the time complexity by O(N) using the Hashing
    // TC: O(n3)*log(unique Triplet)  and SC: O(No of Unique quads)*2 (1. for Set and 2. Ans)
    // nums[l] = target -  nums[i] + nums[j] + nums[k];
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        // Write your code here.
//        List<List<Integer>> output = new ArrayList<>();
//        Set<List<Integer>> uniqueQuadrupletSet = new HashSet<>();
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                Set<Integer> tempHashing = new HashSet<>();
//                for (int k = j + 1; k < n; k++) {
//                    int missingElement = target - (nums[i] + nums[j] + nums[k]);
//                    if (tempHashing.contains(missingElement)) {
//                        ArrayList<Integer> quadruplet = new ArrayList<>(Stream.of(nums[i], nums[j], nums[k], missingElement).toList());
//                        Collections.sort(quadruplet);
//                        uniqueQuadrupletSet.add(quadruplet);
//                    }
//                    tempHashing.add(nums[k]);
//                }
//            }
//        }
//
//        for (List<Integer> uniqueQuadruplet : uniqueQuadrupletSet) {
//            output.add(uniqueQuadruplet);
//        }
//
//        return output;
//    }


//    // BrutForce Approach TC: O(n4)*log(unique Triplet)  and SC: O(No of Unique quads)*2 (1. for Set and 2. Ans)
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        // Write your code here.
//        List<List<Integer>> output = new ArrayList<>();
//        Set<List<Integer>> uniqueQuadrupletSet = new HashSet<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    for (int l = k + 1; l < n; l++) {
//                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
//                        if (sum == target) {
//                            ArrayList<Integer> quadruplet = new ArrayList<>(Stream.of(nums[i], nums[j], nums[k], nums[l]).toList());
//                            Collections.sort(quadruplet);
//                            uniqueQuadrupletSet.add(quadruplet);
//                        }
//                    }
//                }
//            }
//        }
//
//        for (List<Integer> uniqueQuadruplet : uniqueQuadrupletSet) {
//            output.add(uniqueQuadruplet);
//        }
//
//        return output;
//    }
}
