package Algorthims.RandomizedAlgorithms;

import java.util.Random;

import java.util.Random;

public class RandomizedQuickSort {

    /**
     * Comment Block: Main QuickSort Function
     *
     * This function is the main driver for the quick sort algorithm.
     * It picks a random pivot and partitions the array around the pivot.
     *
     * @param arr The array to be sorted.
     * @param low The starting index of the array segment.
     * @param high The ending index of the array segment.
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = randomPartition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    /**
     * Comment Block: Random Partition Function
     *
     * This function chooses a random element as a pivot and
     * partitions the array around it.
     *
     * @param arr The array to be partitioned.
     * @param low The starting index for the array segment.
     * @param high The ending index for the array segment.
     * @return The pivot index.
     */
    public static int randomPartition(int[] arr, int low, int high) {
        Random rand = new Random();
        int randomIndex = low + rand.nextInt(high - low);
        swap(arr, randomIndex, high);
        return partition(arr, low, high);
    }

    /**
     * Comment Block: Partition Function
     *
     * This function partitions the array around the pivot,
     * making sure that all elements smaller than the pivot
     * come before it and all elements greater come after it.
     *
     * @param arr The array to be partitioned.
     * @param low The starting index for the array segment.
     * @param high The ending index for the array segment.
     * @return The pivot index.
     */
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the pivot
        int i = low - 1; // Index for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * Comment Block: Swap Function
     *
     * This function swaps the elements at two indices in an array.
     *
     * @param arr The array where the swap is to be performed.
     * @param i The index of the first element.
     * @param j The index of the second element.
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

