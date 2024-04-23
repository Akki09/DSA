package learnSortingTechniques;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = new int[]{13, 46, 24, 52, 20, 9};
        selectionSort(input);
    }

    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                //find min
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap
            swap(arr, i, min);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
