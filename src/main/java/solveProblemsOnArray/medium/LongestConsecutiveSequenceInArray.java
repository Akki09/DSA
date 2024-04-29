package solveProblemsOnArray.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int[] input = new int[]{5, 2, 3, 3, 3, 4, 5, 5, 5, 1, 1, 0, 8, 3, 2, 1, 4};
        System.out.println(longestSuccessiveElements(input));
    }

    public static int longestSuccessiveElements(int[] a) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }

        for (Integer number : set) {
            if (!set.contains(number - 1)) {
                int count = 1;
                while (set.contains(number + 1)) {
                    number++;
                    count++;
                    ans = Math.max(ans, count);
                }
            }
        }
        return ans;
    }


//    public static int longestSuccessiveElements(int[] a) {
//        // Write your code here.
//        int max = 0;
//        int count = 1;
//        int i = 0;
//        Arrays.sort(a);
//        while (i < a.length - 1) {
//            if(a[i+1] == a[i]){
//                i++;
//                continue;
//            }
//            if (a[i + 1] - a[i] == 1) {
//                count++;
//            } else {
//                max = Math.max(max, count);
//                count = 1;
//            }
//            i++;
//        }
//        return Math.max(max, count);
//    }
}
