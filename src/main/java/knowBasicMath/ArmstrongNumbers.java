package knowBasicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkArmstrong(number);
    }

    public static void checkArmstrong(int n) {
        //Write your code here
        int checker = n;
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n = n / 10;
        }
        Integer result = list.stream().reduce(0, (e1, e2) -> e1 + (int) Math.pow(e2, list.size()));
        if (result == checker) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
