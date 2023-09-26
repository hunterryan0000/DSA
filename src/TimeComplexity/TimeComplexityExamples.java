package TimeComplexity;

/**
 * Time complexity refers to the computational complexity that describes the
 * amount of computational time taken by an algorithm to run as a function
 * of the size of the input to the program.
 *
 *
 * The most common way to express time complexity is through Big O notation.
 * This notation describes the upper bound of an algorithm in the worst-case scenario,
 * although it can be used to describe the average or best-case scenario as well.
 *
 *
 * O(1): Constant time complexity. No matter how large the input, the algorithm takes a constant amount of time.
 * O(log n): Logarithmic time complexity. With each step, the algorithm reduces the size of the input substantially, typically by half.
 * O(n): Linear time complexity. The time it takes to run the algorithm increases linearly with the size of the input.
 * O(n log n): Linear-logarithmic time complexity. More time-consuming than O(n) but better than quadratic complexities. Often seen in efficient sorting algorithms like Merge Sort.
 * O(n^2), O(n^3), ...: Polynomial time complexities. The time complexity grows polynomially with the size of the input. Common in nested loops.
 */
public class TimeComplexityExamples {

    // O(1) - Constant Time
    public void constantTime(int[] arr) {
        System.out.println(arr[0]); // Only one operation, so it's O(1)
    }

    // O(n) - Linear Time
    public void linearTime(int[] arr) {
        for(int i = 0; i < arr.length; i++) { // Loop runs 'n' times
            System.out.println(arr[i]); // O(n)
        }
    }

    // O(n^2) - Quadratic Time
    public void quadraticTime(int[] arr) {
        for(int i = 0; i < arr.length; i++) { // Outer loop runs 'n' times
            for(int j = 0; j < arr.length; j++) { // Inner loop runs 'n' times
                System.out.println(arr[i] + ", " + arr[j]); // O(n^2)
            }
        }
    }

    // O(log n) - Logarithmic Time
    public boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) { // Loop runs log(n) times
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true; // O(log n)
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

