package Algorithms.BruteForce;

public class LinearSearch {

    /**
     * Comment Block: linearSearch Function
     * This function performs linear search on an array to find the given element.
     * It iterates through each element in the array until it finds the desired element,
     * returning the index at which it was found. If the element is not in the array, it returns -1.
     *
     * @param arr The array in which to search for the element
     * @param x   The element to search for
     * @return The index of the element if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int x) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the desired element
            if (arr[i] == x) return i;  // If found, return the index
        }
        return -1;  // If not found, return -1
    }

    public static void main(String[] args) {
        int[] searchArray = {2, 4, 7, 10, 23, 34, 45, 57, 76, 88};
        int elementToFind = 23;

        int foundIndex = linearSearch(searchArray, elementToFind);
        if (foundIndex != -1) {
            System.out.println("Element found at index: " + foundIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}


