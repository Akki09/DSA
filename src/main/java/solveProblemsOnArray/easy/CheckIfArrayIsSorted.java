package solveProblemsOnArray.easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        //int[] input = new int[]{5, 6, 7, 8};
        //int[] input = new int[]{0,0, 0, 1};
        int[] input = new int[]{8,3,4,6,6,7,9,7,4,0,5,5,7,1,5,3,4,3,0,6,4,7,10,9,4,4};
        System.out.println(isSorted(input.length, input));
    }

    public static int isSorted(int n, int[] a) {
        // Write your code here.
        for (int i = 0; i < n - 2; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            }
        }
        return 1;
    }

}
