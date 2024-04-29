package solveProblemsOnArray.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 0, 0));
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);

        ArrayList<ArrayList<Integer>> output = zeroMatrix(input, input.size(), input.get(0).size());

        for (ArrayList<Integer> rows : output) {
            for (Integer columnValue : rows) {
                System.out.print(columnValue + " ");
            }
            System.out.println();
        }


    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    for (int k = 0; k < n; k++) {
                        if (matrix.get(k).get(j) != 0) {
                            matrix.get(k).set(j, -1);
                        }
                    }
                    for (int l = 0; l < m; l++) {
                        if (matrix.get(i).get(l) != 0) {
                            matrix.get(i).set(l, -1);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}
