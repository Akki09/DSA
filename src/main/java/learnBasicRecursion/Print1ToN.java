package learnBasicRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print1ToN {
    public static void main(String[] args) {
        Arrays.stream(printNos(5)).forEach(System.out::print);
        Arrays.stream(printNos(2)).forEach(System.out::print);
    }

    public static int[] printNos(int x) {
        // Write Your Code Here
        ArrayList<Integer> arrayList = new ArrayList<>();
        recursionFunc(1, x, arrayList);
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void recursionFunc(int start, int end, List<Integer> list) {
        if (start > end) {
            return;
        }
        list.add(start);
        start++;
        recursionFunc(start, end, list);
    }
}
