package solveProblemsOnArray.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArraysProblem {

    public static void main(String[] args) {
        int[] input = new int[]{187, 64, 133, 62, 49, 163, 50, 115, 42, 65, 60, 49, 32, 87, 141, 142, 146, 159};
        //int[] input = new int[]{1,2,2,1};
        //output = 159 163 187
        List<Integer> output = superiorElements(input);
        for (Integer i : output) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> superiorElements(int[] a) {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                list.add(a[i]);
            } else {
                while (!list.isEmpty() && list.get(list.size() - 1) < a[i + 1]) {
                    list.remove(list.size() - 1);
                }
            }
            i++;
        }
        if(!list.contains(a[i]))
            list.add(a[i]);
        Collections.sort(list);
        return list;
    }

}
