package solveProblemsOnArray.hard;

import java.util.*;
import java.util.stream.Collectors;

public class MajorityElementNby3Times {
    public static void main(String[] args) {

        //int[] input = new int[]{4};
        int[] input = new int[]{2,1,1,3,1,4,5,6};
        //int[] input = new int[]{0, 2, 0, 0, 1 };
        List<Integer> output = majorityElement(input);
        for (Integer integer : output) {
            System.out.print(integer + " ");
        }

    }

    // Trying to solve it using the Moore's Voting Algo
    //TC: O(2n) (n for traversal, n for verification) Sorting O(2log2) (ignore this) and SC: O(2) ~= O(1)
    public static List<Integer> majorityElement(int[] v) {
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < v.length; i++) {
            //v[i] != ele2 condition we have added extra to understand dry run this [2,1,1,3,1,4,5,6] without condition
            if (cnt1 == 0 && v[i] != ele2) {
                ele1 = v[i];
                cnt1 = 1;
            } else if (cnt2 == 0 && v[i] != ele1) {
                ele2 = v[i];
                cnt2 = 1;
            } else if (ele1 == v[i]) {
                cnt1++;
            } else if (ele2 == v[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        //Verify Here verify step is important because we are not sure there will be 2 element or 1 element. In N/2 case
        // we can avoid verification step A.T.M because we are not returning anything diff if element not found
        // greater than n/2. If we were returning something diff then verification is also mandatory in N/2 case

        //verify
        cnt1 = 0;
        cnt2 = 0;
        for (int j = 0; j < v.length; j++) {
            if (ele1 == v[j]) {
                cnt1++;
            } else if (ele2 == v[j]) {
                cnt2++;
            }
        }
        if (cnt1 > (v.length / 3)) {
            list.add(ele1);
        }
        if (cnt2 > (v.length / 3)) {
            list.add(ele2);
        }
        Collections.sort(list);
        return list;
    }

    // Here we are saving the traversal of Hashmap again for the count TC: O(N) Sorting O(2log2) (ignore this) and SC: (2)(ArrayList) ~= O(1)
//    public static List<Integer> majorityElement(int[] v) {
//        // Write your code here
//        List<Integer> list = new ArrayList<>();
//        //Brutforce approach
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : v) {
//            if (map.containsKey(i)) {
//                int temp = map.get(i) + 1;
//                map.put(i, temp);
//                if (temp > (v.length / 3) && !list.contains(i)) {
//                    list.add(i);
//                    if (list.size() == 2) {
//                        break;
//                    }
//                }
//            } else {
//                map.put(i, 1);
//                if (1 > (v.length / 3)) {
//                    list.add(i);
//                }
//            }
//        }
//        Collections.sort(list);
//        return list;
//    }

//    TC: ~=O(n2) and SC: O(n) In worst case if we don't have any duplicate element
//    public static List<Integer> majorityElement(int[] v) {
//        // Write your code here
//
//        //Brutforce approach
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i : v) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i) + 1);
//            } else {
//                map.put(i, 1);
//            }
//        }
//        return map.entrySet().stream().filter(k -> k.getValue() > v.length / 3).map(Map.Entry::getKey).collect(Collectors.toList());
//    }

}
