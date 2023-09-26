package Algorthims.DivideAndConquer;

public class MergeSort {

    /**
     * Comment Block: merge Function
     * This function merges two sorted sub-arrays arr[l...m] and arr[m+1...r] into a single sorted array.
     * The merge operation requires temporary arrays to hold values for the merging process.
     *
     * @param arr The array to be sorted
     * @param l   Left index
     * @param m   Middle index
     * @param r   Right index
     */
    public static void merge(int arr[], int l, int m, int r) {
        // Calculate the sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays to hold the values of the sub-arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[m + 1 + j];

        // Variables to traverse L[] and R[]
        int i = 0, j = 0;
        // Variable to traverse arr[]
        int k = l;

        // Merge the temporary arrays back into arr[l...r]
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of L[], if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy the remaining elements of R[], if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * Comment Block: sort Function
     * This function is the core of the Merge Sort algorithm.
     * It divides the input array into two halves, recursively sorts them, and then merges them.
     *
     * @param arr The array to be sorted
     * @param l   Left index
     * @param r   Right index
     */
    public static void sort(int arr[], int l, int r) {
        // Base case: An array of a single element is already sorted
        if (l < r) {
            // Calculate the middle point of the array
            int m = l + (r - l) / 2;

            // Recursively sort the first half
            sort(arr, l, m);

            // Recursively sort the second half
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before sorting: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }

        sort(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("\nAfter sorting: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}


