package learnSortingTechniques;

public class QuickSort {
    public static void main(String[] args) {
        //int[] input = new int[]{13, 46, 24, 52, 20, 9};
        int[] input = new int[]{5,6,7,8};
        quickSort(input, 0, input.length - 1);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        // base condition
        if (startIndex >= endIndex) {
            return;
        }
        int partitionIndex = divideConcur(input, startIndex, endIndex);
        quickSort(input, startIndex, partitionIndex - 1);
        quickSort(input, partitionIndex + 1, endIndex);
    }

    private static int divideConcur(int[] input, int startIndex, int endIndex) {
        //First Select Pivot
        int pivot = input[startIndex];
        int leftPointer = startIndex;
        int rightPointer = endIndex;
        while (leftPointer < rightPointer) {
            // loop for leftPointer
            while (leftPointer <= endIndex && input[leftPointer] <= pivot) {
                leftPointer++;
            }
            // loop for rightPointer index
            while (rightPointer >= startIndex && input[rightPointer] > pivot) {
                rightPointer--;
            }
            // Check condition leftPointer Should not crossed the rightPointer
            // meaning we are swapping smaller to left and greater to right
            if (leftPointer < rightPointer) {
                swap(input, leftPointer, rightPointer);
            }
        }
        // Now switch the actual PIVOT after left right things
        swap(input, startIndex, rightPointer);
        return rightPointer;
    }

    private static void swap(int[] arr, int j, int j1) {
        int temp = arr[j];
        arr[j] = arr[j1];
        arr[j1] = temp;
    }
}
