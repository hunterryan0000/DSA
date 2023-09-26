package com.hunterscode.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections_Streams {
    public static void main(String[] args) {
        /**Collections are data structures used to store and organize groups of objects.
         * They provide methods for adding, removing, and manipulating elements within the collection.
         * Some common examples of collections are lists, sets, and maps.*/
        System.out.println("List: ");
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();


        /**Streams, introduced in Java 8, are a more advanced way to process and manipulate data.
         * Streams allow you to perform operations on data in a declarative and functional style.
         * They are designed to process data in a pipeline manner, where each operation in the pipeline transforms the data and passes it to the next operation.*/
        System.out.println("Stream: ");
        List<String> names2 = Arrays.asList("Alice", "Bob", "Charlie");
        names2.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
