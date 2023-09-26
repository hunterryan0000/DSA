package DataStructures;

import StackVSQueue.QueueUsingStacks;

public class MAIN {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // Remove elements from priority queue
        System.out.println(pq.poll());  // Output: 10 (minimum element)
        System.out.println(pq.poll());  // Output: 20

        QueueUsingStacks queue = new QueueUsingStacks();

        // Step 1: Enqueue 1 to the rear
        queue.enqueue(1);
        // Print statement can be like: System.out.println(queue); // Output: [1]

        // Step 2: Enqueue 2 to the rear
        queue.enqueue(2);
        // System.out.println(queue); // Output: [1, 2]

        // Step 3: Enqueue 3 to the rear
        queue.enqueue(3);
        // System.out.println(queue); // Output: [1, 2, 3]

        // Step 4: Enqueue 0 to the front (Deque operation)
        queue.enqueueFront(0);
        // System.out.println(queue); // Output: [0, 1, 2, 3]

        // Step 5: Dequeue from the front
        System.out.println(queue.dequeue()); // Output: 0

        // Step 6: Dequeue from the rear (Deque operation)
        System.out.println(queue.dequeueRear()); // Output: 3

        // Step 7: Dequeue from the rear again (Deque operation)
        System.out.println(queue.dequeueRear()); // Output: 2


    }

    /**
     * This function calculates the factorial of a number using recursion.
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the number n.
     */
    public static int factorial(int n) {
        // Base case: factorial of 1 or 0 is 1
        if (n <= 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    /**
     * This function calculates the nth Fibonacci number using dynamic programming.
     * @param n The position of the Fibonacci number to calculate.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        // Initialize an array to store the Fibonacci numbers
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 0;
        if (n > 0) {
            dp[1] = 1;
        }

        // Calculate the Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


}
