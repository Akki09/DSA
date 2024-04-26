package solveProblemsOnArray.easy;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2, 3};
        System.out.println(removeDuplicates(input, input.length));
    }

    public static int removeDuplicates(int[] arr, int n) {
        // Write your code here.
        int count = 1;
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
