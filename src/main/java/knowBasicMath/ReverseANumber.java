package knowBasicMath;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverseBits(12));
    }

    public static long reverseBits(long n) {
        // Write your code here
        int number = (int) n;
        StringBuilder reverseBit = new StringBuilder();

        for (int i = 0; i <= 31; i++) {
            int result = number >> i;
            if ((result & 1) > 0) {
                reverseBit.append("1");
            } else {
                reverseBit.append("0");
            }
        }
        return Long.parseLong(reverseBit.toString(), 2);
    }
}
