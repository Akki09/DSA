package solveProblemsOnArray.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArrayByDPlace {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(7);
        ArrayList<Integer> output = rotateArray(input,4);
        output.forEach(System.out::print);

    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int noOfRotation = k% arr.size();
        if(noOfRotation == 0){
            return arr;
        }
        int startIndex = arr.size() - noOfRotation;

        Integer[] temp = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            if (startIndex >= arr.size()) {
                startIndex = 0;
            }
            temp[startIndex] = arr.get(i);
            startIndex++;
        }
        return new ArrayList<>(Arrays.asList(temp));
    }
}
