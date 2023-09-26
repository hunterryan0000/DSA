package LinkedList;

// Define a LinkedList class
public class LinkedList {
    // 'head' variable points to the first node in the list
    Node head;

    // Reverse the linked list in-place
    public void reverse() {
        // Initialize pointers for the previous, current, and next nodes
        Node prev = null;
        Node current = head;
        Node next = null;



        // Iterate through each node in the list
        while (current != null) {
            // Save the next node in 'next'
            next = current.next;

            // Update 'next' pointer of the current node to point to its previous node
            current.next = prev;

            // Move the 'prev' and 'current' pointers one step forward
            prev = current;
            current = next;
        }
        // Update the head to point to the last node, as the list is now reversed
        head = prev;
    }



    // Check if the linked list has a cycle
    public boolean hasCycle() {
        // Initialize slow and fast pointers to the head
        Node slow = head;
        Node fast = head;

        // Move through the list with 'slow' advancing one node at a time and 'fast' two nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If they meet, then a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        // If loop exits, no cycle
        return false;
    }



    // Get the value at a specific index
    public int get(int index) {
        // Initialize a current node and a counter
        Node current = head;
        int count = 0;

        // Iterate through the list
        while (current != null) {
            // If counter matches index, return the data
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1;  // Element not found
    }



    // Remove the node at a specific index
    public void remove(int index) {
        // Initialize current node and a counter
        Node current = head;
        int count = 0;

        // Special case for removing the head node
        if (index == 0) {
            head = head.next;
            return;
        }

        // Iterate through the list
        while (current != null) {
            // Find the node just before the target node
            if (count == index - 1) {
                // Update its 'next' pointer to skip the target node
                current.next = current.next.next;
                return;
            }
            count++;
            current = current.next;
        }
    }
}

