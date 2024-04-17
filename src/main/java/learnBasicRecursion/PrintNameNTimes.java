package learnBasicRecursion;

import java.util.ArrayList;
import java.util.List;

public class PrintNameNTimes {
    public static void main(String[] args) {

        printNtimes(5).forEach(System.out::print);

    }

    public static List<String> printNtimes(int n) {
        ArrayList<String> list = new ArrayList<>();
        printName(1, n, list);
        return list;
    }

    public static void printName(int start, int end, List<String> list) {
        if (start > end) {
            return;
        }
        list.add("Akshay Coding Master ");
        start++;
        printName(start, end, list);
    }
}
