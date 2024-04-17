package knowBasicMath;

import java.util.ArrayList;

public class CheckPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(5));
    }

    public static String isPrime(int num) {
        //Your code goes here
        //Check why if we use count Runtime graph degrade
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                list.add(i);
                if (list.size() > 1) {
                    break;
                }
            }
        }
        return list.size() == 1 ? "YES" : "NO";
    }
}
