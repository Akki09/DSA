package knowBasicMath;

public class GCDOrHCF {
    public static void main(String[] args) {
        System.out.println(calcGCD(6, 4));
        System.out.println(calcGCD(63, 45));
    }

    public static int calcGCD(int n, int m) {
        // Write your code here.
        int min = n > m ? m : n;
        int max = n > m ? n : m;
        while (max % min != 0) {
            int reminder = max%min;
            max = min;
            min = reminder;
        }
        return min;
    }
}
