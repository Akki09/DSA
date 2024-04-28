package solveProblemsOnArray.medium;

public class RearrangeAlternatingPositiveAndNegativeItems {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, -4, -5};
        int[] output = alternateNumbers(input);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    public static int[] alternateNumbers(int[] a) {
        // Write your code here.
        int[] result = new int[a.length];
        int positivePointer = 0;
        int negativePointer = 1;

        for (int i : a) {
            if (i > 0) {
                result[positivePointer] = i;
                positivePointer += 2;
            } else {
                result[negativePointer] = i;
                negativePointer += 2;
            }
        }
        return result;
    }
}
