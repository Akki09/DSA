package solveProblemsOnArray.easy;

public class FindNumberAppearTwice {
    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2, 3, 3, 4, 4};
        System.out.println(getSingleElement(input));
    }

    public static int getSingleElement(int[] arr) {
        // Write your code here.
        int XOR = arr[0];
        for (int i = 1; i < arr.length; i++) {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }
}
