package com.hunterscode.datastructures;

import java.util.*;

public class Collections_Demo {
    public static void main(String[] args) {
        String[] stringArray = new String[5];
        String[] stringArray2 = new String[]{"423", "Hi", "Hello", "red"};
        String[] stringArray3 = Arrays.copyOf(stringArray2, stringArray2.length);
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray3));

        System.out.println("numArray: " + Arrays.toString(stringArray));
        System.out.println("numArray2: " + Arrays.toString(stringArray2));
        System.out.println("numArray3: " + Arrays.toString(stringArray3));
        System.out.println("stringList: " + stringList);
        System.out.println();
        System.out.println("Length of numArray: " + stringArray.length);
        System.out.println("Lengh of numArray2: " + stringArray2.length);
        System.out.println();
        stringArray2 = stringArray;
        System.out.println("numArray2: " + Arrays.toString(stringArray2));
        System.out.println("Length of numArray: " + stringArray.length);
        System.out.println("Length of numArray2: " + stringArray2.length);
        System.out.println("numArray: " + Arrays.toString(stringArray));
        System.out.println("numArray2: " + Arrays.toString(stringArray2));


        System.out.println();
        stringArray[2] = "Hello Patrick";


        System.out.println("numArray: " + Arrays.toString(stringArray));
        System.out.println("numArray2: " + Arrays.toString(stringArray2));
        System.out.println();

        Queue<String> queue = new LinkedList<>(Arrays.asList("Ryan", "Jamal", "Hunter", "Kloud 9"));
        //Queue interface. LinkedList concrete class
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.offer("Kloud 9"));
        System.out.println(queue.add("Me"));
        System.out.println(queue);
        System.out.println();

        Set<String> stringSet = new HashSet<>(Arrays.asList("Ryan", "Jamal", "Hunter", "Kloud 9"));
        System.out.println(stringSet);
        System.out.println();

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("First", "Ryan");
        stringMap.put("Last", "Hunter");
        System.out.println(stringMap.get("Last"));
        System.out.println(stringMap.keySet());
        System.out.println(stringMap.getOrDefault("middle", "pop"));
        System.out.println(stringMap);
        for (Map.Entry<String, String> lilMap : stringMap.entrySet()){
            System.out.println(lilMap.getKey());
            System.out.println(lilMap.getValue());
            System.out.println("bye "+ lilMap.setValue("lo"));
        }
        System.out.println(stringMap);
        System.out.println();

        Map<Integer, Integer> integerMap = Map.of(
                0, 1,
                1, 2,
                8, 9
        );
        System.out.println(integerMap);
        for (Integer lilEntry: integerMap.keySet()){
            System.out.println("key: " + lilEntry);
//            System.out.println(lilEntry.byteValue());
//            System.out.println(lilEntry.toString());
//            System.out.println(lilEntry.hashCode());
            System.out.println("value: " + integerMap.get(lilEntry));
        }
        System.out.println(integerMap);
        System.out.println();

        Stack<String> stringStack = new Stack<>();
        stringStack.add("Alexis");
        stringStack.add("Shonte");
        stringStack.add("Fowler");
        stringStack.add("Zaiden");
        System.out.println(stringStack);
        System.out.println(stringStack.peek());
        System.out.println(stringStack);
        System.out.println(stringStack.pop());
        System.out.println(stringStack.push("Zonte"));
        System.out.println(stringStack.add("Zia"));
        System.out.println(stringStack);
        System.out.println();

        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("b");
        stringDeque.add("c");
        stringDeque.add("d");
        stringDeque.add("e");
        System.out.println(stringDeque);
        System.out.println("peek: " + stringDeque.peek());
        System.out.println(stringDeque);
        System.out.println("pop: " + stringDeque.pop());
        System.out.println("offerfirst: " + stringDeque.offerFirst("a"));
        System.out.println("offerlast: " + stringDeque.offerLast("f"));
        System.out.println("offer: " + stringDeque.offer("g"));
        System.out.println(stringDeque);
        System.out.println("first: " + stringDeque.getFirst());
        System.out.println("lst: " + stringDeque.getLast());
        System.out.println("peekfirst: " + stringDeque.peekFirst());
        System.out.println("pollfirst: " + stringDeque.pollFirst());
        System.out.println("polllast: " + stringDeque.pollLast());
        System.out.println("poll: " + stringDeque.poll());
        System.out.println(stringDeque);
        System.out.println("peeklast: " + stringDeque.peekLast());
        System.out.println("remove: " + stringDeque.remove());
        System.out.println("removefirst: " + stringDeque.removeFirst());
        System.out.println("removelast: " + stringDeque.removeLast());
        System.out.println("add: " + stringDeque.add("h"));
        System.out.println(stringDeque);
        System.out.println("removelastocc: " + stringDeque.removeLastOccurrence("h"));
        System.out.println(stringDeque);

    }
}
