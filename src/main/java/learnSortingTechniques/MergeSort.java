package learnSortingTechniques;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] input = new int[]{13, 46, 24, 52, 20, 9};
        mergeSort(input, 0, input.length - 1);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        // Write your code here
        // Base Condition
        if (l >= r) {
            return;
        }
        // Rest of the operation
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        ArrayList<Integer> tempList = new ArrayList<>();
        int left = l;
        int right = mid + 1;
        while (left <= mid && right <= r) {
            if (arr[left] <= arr[right]) {
                tempList.add(arr[left]);
                left++;
            } else {
                tempList.add(arr[right]);
                right++;
            }
        }
        // For the remaining left pointers
        while (left <= mid) {
            tempList.add(arr[left]);
            left++;
        }
        // For the remaining right pointers
        while (right <= r) {
            tempList.add(arr[right]);
            right++;
        }

        // return the original array
        int j = 0;
        for (int i = l; i <= r; i++) {
            arr[i] = tempList.get(j);
            j++;
        }
    }
}
