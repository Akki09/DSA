package solveProblemsOnArray.medium;

import java.util.HashMap;

public class CountSubarraysWithGivenSum {

    public static void main(String[] args) {
        //int[] input = new int[]{3, 1, 2, 4};
        //System.out.println(findAllSubarraysWithGivenSum(input, 6));
        int[] input = new int[]{1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(findAllSubarraysWithGivenSum(input, 3));
    }

    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.

        // Create a HashSet with sum and count
        // Keep 0 in Hashset with count 1 (So if we have first element as 3 then we can validate that)

        // So basically ideal is to found the count of subarray which gives the sum K
        // Previously we were storing sum with the index to subtract everything now we will be storing the sum's count
        // Here we will be updating the count as we need the max possible count
        // In previous we need the longest subarrays so we were not adding the same sum with different index if we have sum already present then skip
        // so by that way zeros and negative were handled

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum - s)) {
                count = count + map.get(sum - s);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }
}
