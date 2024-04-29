package solveProblemsOnArray.medium;

public class RotateMatrixBy90Degrees {
    public static void main(String[] args) {
        int[][] input = new int[4][4];
        int count = 1;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                input[i][j] = count;
                count++;
            }
        }

        System.out.println("----------INPUT---------");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        System.out.println("----------OUTPUT---------");
        rotateMatrix(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

    }

    public static void rotateMatrix(int[][] mat) {
        // Write your code here.
        //QUESTION                    ANSWER for 90o Rotation
        // 1  2  3  4                 13  9  5  1
        // 5  6  7  8                 14 10  6  2
        // 9 10 11 12                 15 11  7  3
        //13 14 15 16                 16 12  8  4

        //Step 1. First Step Transpose
        // 1*  5  9  13
        // 2  6*  10 14
        // 3  7  11* 15
        // 4  8  12  16*

        //TO Transpose Diagonal will remain same. And upper triangle will get swap with lower triangle
        // So Run Swap function for upper triangle and your transpose will be done

        int size = mat.length; //4
        // As for last row upper swap is not needed
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                swap(mat, i, j);
            }
        }

        //Step 2. Reverse each rows and TADAAA you are done.
        for (int row = 0; row < mat.length; row++) {
            int leftPointer = 0;
            int rightPointer = mat[row].length - 1;

            while (leftPointer < rightPointer) {
                swap(mat[row], leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }


    }

    private static void swap(int[] matrix, int leftPointer, int rightPointer) {
        int temp = matrix[leftPointer];
        matrix[leftPointer] = matrix[rightPointer];
        matrix[rightPointer] = temp;
    }

    private static void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
