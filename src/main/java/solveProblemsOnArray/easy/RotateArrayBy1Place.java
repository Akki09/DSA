package solveProblemsOnArray.easy;

public class RotateArrayBy1Place {

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2, 3};
        rotateArray(input, input.length);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int first = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;
        return arr;
    }
}
