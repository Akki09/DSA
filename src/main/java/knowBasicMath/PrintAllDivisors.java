package knowBasicMath;

import java.util.stream.IntStream;

public class PrintAllDivisors {
    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(3));
    }

    public static int sumOfAllDivisors(int n) {
        // Write your code here.
        if (n == 1) {
            return 1;
        }
        return IntStream.rangeClosed(2, n).map(PrintAllDivisors::doDivisorSum).reduce(1, Integer::sum);
    }

    //this log(n/2) complexity
//    public static int doDivisorSum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n / 2; i++) {
//            if (n % i == 0) {
//                sum += i;
//            }
//        }
//        return sum += n;
//    }


    //1 * 36
    //2 * 18
    //3 * 12
    //4 * 9
    //----------------------------------
    //6 * 6
    //----------------------------------
    //9 * 4
    //12 *3
    //18 *2
    //36 *1

        public static int doDivisorSum(int n) {
            int sum = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    sum += i;
                    if (n / i != i) {
                        sum += n / i;
                    }
                }
            }
            return sum;
        }
}
