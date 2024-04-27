package solveProblemsOnArray.easy;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 1, 1, 1, 0, 0, 1};
        System.out.println(traffic(input.length, 2, input));
    }

    public static int traffic(int n, int m, int[] vehicle) {
        int ans = 0;
        int j = 0;
        int flip = 0; // TO count the flip it made

        for (int i = 0; i < n; i++) {
            if (vehicle[i] == 0) {
                flip++;

                //m is max flip is allowed
                while (flip > m) {
                    if (vehicle[j] == 0) {
                        flip--;
                    }
                    j++;
                }

            }
            ans = Math.max(ans, (i - j + 1));
        }

        return ans;
    }
}
