package solveProblemsOnArray.easy;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 2, 0, 5, 0, 6, 0};
        System.out.println(linearSearch(input.length, 6, input));
        System.out.println(linearSearch(input.length, 0, input));
        System.out.println(linearSearch(input.length, 2, input));
        System.out.println(linearSearch(input.length, 9, input));
    }

    public static int linearSearch(int n, int num, int[] arr) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
