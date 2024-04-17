package learnBasicRecursion;

import java.util.stream.LongStream;

public class SumFirstNNumber {
    public static void main(String[] args) {
        System.out.println(sumFirstN(100));
        System.out.println(sumFirstN(10));
    }

    public static long sumFirstN(long n) {
        // Write your code here.(As below score is 39XP only, trying out recursion)
        //return LongStream.rangeClosed(0, n).reduce(Long::sum).getAsLong();
        return recuSumFunc(1, n);
    }

    //39xp
    public static long recuSumFunc(long start, long end) {
        if (start > end) {
            return 0;
        }
       return start + recuSumFunc(++start, end);

    }

    //38xp only
//    public static long recuSumFunc(long num) {
//        if (num == 0 ) {
//            return 0;
//        }
//        return num + recuSumFunc(num-1);
//    }
}
