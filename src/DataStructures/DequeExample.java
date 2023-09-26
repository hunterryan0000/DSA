package DataStructures;

import java.util.Deque;
import java.util.LinkedList;

//the Deque interface in Java! It's an acronym for "Double Ended Queue" and
// provides a powerful data structure for inserting, removing, and inspecting elements
// from both ends of the queue with excellent efficiency.
public class DequeExample {
    public static void main(String[] args) {
        // Initialize a Deque using the LinkedList implementation
        Deque<Integer> myDeque = new LinkedList<>();

        /**
         * ADDING ELEMENTS
         * -------------------
         * The Deque interface allows you to add elements at both ends.
         * - addFirst(): Adds an element at the beginning of the deque.
         * - addLast(): Adds an element at the end of the deque.
         */

        // Add elements at the beginning
        myDeque.addFirst(1); // [1]
        myDeque.addFirst(2); // [2, 1]

        // Add elements at the end
        myDeque.addLast(3); // [2, 1, 3]
        myDeque.addLast(4); // [2, 1, 3, 4]

        // Display the deque
        System.out.println("Deque after adding elements: " + myDeque); // Output: [2, 1, 3, 4]

        /**
         * REMOVING ELEMENTS
         * ----------------------
         * You can remove elements from both ends as well.
         * - removeFirst(): Removes and returns the first element of the deque.
         * - removeLast(): Removes and returns the last element of the deque.
         */

        // Remove elements from the beginning
        int removedFirst = myDeque.removeFirst(); // Returns 2 and deque becomes [1, 3, 4]

        // Remove elements from the end
        int removedLast = myDeque.removeLast(); // Returns 4 and deque becomes [1, 3]

        // Display the deque after removal
        System.out.println("Deque after removing elements: " + myDeque); // Output: [1, 3]
        System.out.println("Removed elements: " + removedFirst + ", " + removedLast); // Output: 2, 4

        /**
         * INSPECTING ELEMENTS
         * ----------------------
         * You can also inspect elements without removing them.
         * - peekFirst(): Returns the first element without removing it.
         * - peekLast(): Returns the last element without removing it.
         */

        // Inspect first and last elements
        int firstElement = myDeque.peekFirst(); // Should return 1
        int lastElement = myDeque.peekLast(); // Should return 3

        System.out.println("First Element: " + firstElement); // Output: 1
        System.out.println("Last Element: " + lastElement); // Output: 3
    }
}





