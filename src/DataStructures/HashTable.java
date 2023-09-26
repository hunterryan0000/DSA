package DataStructures;

import java.util.LinkedList;

// Class definition for HashTable
public class HashTable {

    // 'table' is an array of LinkedLists that will store our keys.
    private LinkedList<Integer>[] table;

    // 'size' defines the capacity of our hash table.
    private int size;

    // Constructor to initialize HashTable with a given size.
    public HashTable(int size) {
        // Initialize 'size' with the provided size.
        this.size = size;

        // Initialize 'table' with empty LinkedLists.
        table = new LinkedList[size];
    }

    // Method to insert a key into the hash table.
    public void put(int key) {
        // Get the index by applying the hash function to the key.
        int index = hash(key);

        // If the linked list at this index is null, initialize it.
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Add the key to the linked list at this index.
        table[index].add(key);
    }

    // Private method to apply hash function to a given key.
    // In this simple example, the hash function is key modulo table size.
    private int hash(int key) {
        return key % size;
    }
}

