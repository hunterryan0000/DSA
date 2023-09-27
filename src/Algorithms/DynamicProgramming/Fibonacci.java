package Algorithms.DynamicProgramming;

public class Fibonacci {

    /**
     * Comment Block: Fibonacci using Dynamic Programming (Memoization)
     * This method calculates Fibonacci numbers in an optimized way using dynamic programming.
     * Memoization helps to store previously computed results, so we don't recompute them, reducing time complexity.
     *
     * @param n    The Fibonacci term to be calculated
     * @param memo The memoization array that stores previously calculated Fibonacci terms
     * @return     The nth Fibonacci number
     */
    public static long fibonacci(int n, long[] memo) {
        // Base case: Fibonacci numbers for 0 and 1 are 0 and 1, respectively
        if (n <= 1) return n;

        // If the Fibonacci number is already calculated (memo[n] != 0), return it
        if (memo[n] != 0) return memo[n];

        // Otherwise, calculate the Fibonacci number and store it in memo
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        // Return the calculated Fibonacci number
        return memo[n];
    }

    /**
     * Comment Block: Main Method
     * This main method is the starting point of the application.
     * It creates a memo array and initializes the calculation for the 50th Fibonacci number.
     */
    public static void main(String[] args) {
        int n = 50; // Find the 50th Fibonacci number
        long[] memo = new long[n + 1]; // Array to store memoized Fibonacci numbers; initialized to 0

        // Output the 50th Fibonacci number (It should be 12586269025)
        System.out.println(fibonacci(n, memo));
    }
}


