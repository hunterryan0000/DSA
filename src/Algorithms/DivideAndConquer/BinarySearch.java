package Algorithms.DivideAndConquer;

public class BinarySearch {

    /**
     * Perform binary search on a sorted array to find the position of target value.
     *
     * @param arr    The sorted array
     * @param target The value to search for
     * @return       The index of the target value, or -1 if not found
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;  // Initialize low index
        int high = arr.length - 1;  // Initialize high index

        while (low <= high) {
            int mid = (low + high) / 2;  // Calculate the midpoint of the array

            if (arr[mid] == target) {
                return mid;  // Target value found
            } else if (arr[mid] < target) {
                low = mid + 1;  // Adjust low index to search the right half
            } else {
                high = mid - 1;  // Adjust high index to search the left half
            }
        }

        return -1;  // Target value not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(arr, 5));  // Output: 2
        System.out.println(binarySearch(arr, 10));  // Output: -1
    }
}

