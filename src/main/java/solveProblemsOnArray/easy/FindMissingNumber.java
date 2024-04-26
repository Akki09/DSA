package solveProblemsOnArray.easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] input1 = new int[]{3,0,1};
        System.out.println(findMissing(input1, input1.length));
    }

    public static int findMissing(int[] arr, int n) {
        int xor1 = 0;
        for (int i = 0; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
        }

        return xor1 ^ xor2;
    }
}
