package learnBasicHashing;

public class CountFrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] input = new int[]{11, 14, 8, 3, 12, 14, 1, 7, 4, 3};
        int[] output = countFrequency(10, 6, input);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }

    public static int[] countFrequency(int n, int x, int[] nums) {
        // Initialize an array of size n;
        int[] input = new int[n];
        //input the array
        for (int i : nums) {
            if (i <= n) {
                input[i - 1] = input[i - 1] + 1;
            }
        }
        return input;
    }
}
