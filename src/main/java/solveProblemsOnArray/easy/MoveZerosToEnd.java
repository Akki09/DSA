package solveProblemsOnArray.easy;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 2, 0, 5, 0, 6, 0};
        moveZeros(input.length, input);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static int[] moveZeros(int n, int[] a) {
        // Write your code here.
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (a[i] == 0) {
                while (j >= 0 && a[j] == 0) {
                    j--;
                }
                if (i < j) {
                    swap(a, i, j);
                }
            }
            i++;
        }
        return a;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
