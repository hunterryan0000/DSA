package LinkedList;

// The Node class defines the basic unit for the LinkedList.
class Node {

    // 'data' holds the integer value for this node
    int data;

    // 'next' is a reference pointing to the next node in the list.
    // It's initialized to 'null', meaning it doesn't point to any node initially.
    Node next;

    // Constructor for Node class
    public Node(int data) {

        // Initializing 'data' field with the provided value.
        this.data = data;

        // Initially, set the next node as 'null'
        // This is useful especially for the last node in the list.
        this.next = null;
    }
}


