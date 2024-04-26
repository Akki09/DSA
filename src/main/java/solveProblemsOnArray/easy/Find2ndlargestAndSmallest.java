package solveProblemsOnArray.easy;

public class Find2ndlargestAndSmallest {

    public static void main(String[] args) {
        int[] input = new int[]{5, 6, 7, 8};
        int[] secondOrderElements = getSecondOrderElements(input.length, input);
        System.out.println(secondOrderElements[0] + " " + secondOrderElements[1]);
    }

    public static int[] getSecondOrderElements(int n, int[] a) {

        int max = a[0];
        int smax = Integer.MIN_VALUE;
        int min = a[0];
        int smin = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            // For Max
            if (a[i] > max) {
                int temp = max;
                max = a[i];
                smax = temp;
            }
            // For sMax
            if (a[i] < max && a[i] > smax) {
                smax = a[i];
            }
            // For Min
            if (a[i] < min) {
                int temp = min;
                min = a[i];
                smin = temp;
            }
            // For sMax
            if (a[i] > min && a[i] < smin) {
                smin = a[i];
            }
        }
        return new int[]{smax, smin};
    }
}
