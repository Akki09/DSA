package knowBasicMath;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(35));
        System.out.println(countDigits(336));
    }

    public static int countDigits(int n) {
        int count = 0;
        int reminder;
        int quotient = n;
        while (quotient > 0) {
            reminder = quotient % 10;
            quotient = quotient / 10;
            if (reminder > 0 && (n % reminder) == 0) {
                count++;
            }
        }
        return count;
    }
}
