package solveProblemsOnArray.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class NextPermutation {
    public static void main(String[] args) {
        //List<Integer> input = new ArrayList<>(Stream.of(2, 1, 5, 4, 3, 0, 0).toList());
        List<Integer> input = new ArrayList<>(Stream.of(5, 3, 4, 1, 0, 0).toList());
        List<Integer> output = nextGreaterPermutation(input);
        for (Integer i : output) {
            System.out.print(i + " ");
        }

    }

    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        // Write your code here.
        //[2,1,5,4,3,0,0]
        // Find the break Point(Un Even)
        int index = -1;
        for (int i = A.size() - 2; i >= 0; i--) {
            if (!(A.get(i) >= A.get(i + 1))) {
                index = i;
                break;
            }
        }

        // If No break point then
        if (index == -1) {
            Collections.reverse(A);
            return A;
        }

        // Find the smallest but greater than break point index for swap from remaining
        for (int i = A.size() - 1; i > index; i--) {
            if (A.get(i) > A.get(index)) {
                Collections.swap(A, i, index);
                break;
            }
        }
        // Try to place remaining in sorted order
        int startSwap = index + 1;
        int endSwap = A.size() - 1;
        while (startSwap < endSwap) {
            Collections.swap(A, startSwap, endSwap);
            startSwap++;
            endSwap--;
        }

        return A;
    }
}
