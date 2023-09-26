package StackVSQueue;

import java.util.Stack;

// Class to implement a queue (and now also a deque) using two stacks
public class QueueUsingStacks {

    // stack1 is primarily for enqueue operations
    Stack<Integer> stack1 = new Stack<>();

    // stack2 is used for dequeue operations
    Stack<Integer> stack2 = new Stack<>();

    // Method to add an element to the rear of the queue
    public void enqueue(int item) {
        // Simply push the item onto stack1
        stack1.push(item);
    }

    // Method to remove and return the element from the front of the queue
    public int dequeue() {
        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // If stack2 still has elements, pop and return the top
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        return -1; // Queue is empty
    }

    // Method to add an element to the front of the queue (Deque operation)
    public void enqueueFront(int item) {
        // Simply push the item onto stack2
        stack2.push(item);
    }

    // Method to remove and return the element from the rear of the queue (Deque operation)
    public int dequeueRear() {
        // If stack1 has elements, pop and return the top
        if (!stack1.isEmpty()) {
            return stack1.pop();
        }
        // If stack1 is empty, transfer elements from stack2 to stack1
        else {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        // If stack1 still has elements, pop and return the top
        if (!stack1.isEmpty()) {
            return stack1.pop();
        }
        return -1; // Deque is empty
    }
}
