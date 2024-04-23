package learnSortingTechniques;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = new int[]{13, 46, 24, 52, 20, 9};
        bubbleSort(input, input.length);
    }

    public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        for (int i = n-1; i > 0; i--) {
            int isSwap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    isSwap++;
                }
            }
            if (isSwap == 0) {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int j, int j1) {
        int temp = arr[j];
        arr[j] = arr[j1];
        arr[j1] = temp;
    }
}
