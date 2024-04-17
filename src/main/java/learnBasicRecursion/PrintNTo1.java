package learnBasicRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNTo1 {

    public static void main(String[] args) {
        Arrays.stream(printNos(20)).forEach(System.out::print);
    }

    public static int[] printNos(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        printNumbers(1, x, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void printNumbers(int start, int end, List<Integer> list) {
        if (start > end) {
            return;
        }
        start++;
        printNumbers(start, end, list);
        list.add(--start);
    }
}
