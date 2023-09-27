package Algorithms.BruteForce;

public class BubbleSort {

    /**
     * Comment Block: bubbleSort Function
     * This function sorts an array of integers using the Bubble Sort algorithm.
     * Bubble Sort works by repeatedly swapping the adjacent elements if they are in the wrong order.
     *
     * @param arr The array of integers to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;  // Get the length of the array

        // Outer loop: Represents the number of elements that are correctly placed at the end of the array
        for (int i = 0; i < n - 1; i++) {

            // Inner loop: Compares each pair of adjacent items and swaps them if they are in the wrong order
            for (int j = 0; j < n - 1 - i; j++) {
                // If the element found is greater than the next element, then swap
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];       // Temporary storage for arr[j]
                    arr[j] = arr[j + 1];     // Swap the two elements
                    arr[j + 1] = temp;       // Complete the swap
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {5, 8, 2, 1, 6, 3, 7, 4};
        System.out.println("Before sorting: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }

        bubbleSort(arrayToSort);

        System.out.println("\nAfter sorting: ");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}

