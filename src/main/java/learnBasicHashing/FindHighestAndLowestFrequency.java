package learnBasicHashing;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FindHighestAndLowestFrequency {
    public static void main(String[] args) {
        //int[] input = new int[]{1, 2, 3, 1, 1, 4};
        int[] input = new int[]{11, 13, 3, 14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3};
        int[] output = getFrequencies(input);
        for (int i : output) {
            System.out.print(i + " ");
        }

    }

    public static int[] getFrequencies(int[] v) {
        // Write Your Code Here
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : v) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int[] output = new int[2];
        output[0] = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        output[1] = Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return output;
    }
}
