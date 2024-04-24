package learnSortingTechniques;

public class InsertionSort {

    public static void main(String[] args) {
        int[] input = new int[]{13, 46, 24, 52, 20, 9};
        insertionSort(input, input.length);
    }

    public static void insertionSort(int[] arr, int n) {
        //Your code goes here
        for(int i =0; i<n; i++){
            int isSwap = 0;
            for(int j = n-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
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
