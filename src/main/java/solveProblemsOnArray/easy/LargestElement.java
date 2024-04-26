package solveProblemsOnArray.easy;

public class LargestElement {

    public static void main(String[] args) {
        int[] input = new int[]{5, 6, 7, 8};
        System.out.println(largestElement(input, input.length));
    }

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
