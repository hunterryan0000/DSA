package Algorthims;
//Greatest Common Divisor
public class GCD {
    // Comment Block: Euclidean algorithm to find the GCD of two numbers
    // This function uses recursion to find the GCD of 'a' and 'b'.
    // Parameters:
    // a, b - The two integers whose GCD is to be found
    public static int findGCD(int a, int b) {
        // Base case: When 'b' becomes zero, 'a' is the GCD
        if (b == 0) {
            return a;
        }

        // Recursive call: The GCD of 'a' and 'b' is the same as the GCD of 'b' and 'a % b'
        return findGCD(b, a % b);
    }

    // Main function to test the findGCD method
    public static void main(String[] args) {
        // Test the findGCD function with example numbers 56 and 48
        // The GCD of 56 and 48 is 8
        System.out.println(findGCD(56, 48)); // Output: 8
    }
}


