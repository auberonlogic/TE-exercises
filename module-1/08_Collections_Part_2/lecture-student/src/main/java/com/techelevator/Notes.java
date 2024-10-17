package com.techelevator;

import java.util.*;

public class Notes {

    public static void main(String[] args) {

        // Continuing linear data structures

        // We discussed lists, which are somewhat like arrays in that they are 0 indexed, ordered, and all elements are of one data type. But they differ in that they can be added to and removed from, are not of fixed size, and give us access to all the Collections library functions.

        // Other implementations of the Collections library are STACKS and QUEUES. Both are linear collections, meaning they retain the order of their creation

        // Stack (not like the memory stack). This is a Collection in Java.


        // Queue
        // FIFO -> first in first out
            // the first thing you put in a queue is the first thing you take out
            // visualize people waiting in line for coffee. The first one in line is the first to order and get their coffee and leave the line.

        // Stack
        // LIFO -> last in first out
            // last thing you put in is the first thing you take out
            // visualize a stack of papers. You lay down 100 pages, then pick them up one by one. The first one you pick up is the last one you had put down.

        // It's in the name. That's helpful. A stack behaves like a stack. A queue behaves like a queue.

        // These are Collections, so we get all the Collections methods, like .size()

        // Things differ though in how we add and remove elements to and from these Collections (stack and queue)

        // To add to a stack -> stack.push(element);
        // to remove from a stack -> stack.pop(); returms the newest element

        // To add to a queue -> queue.offer(element);
        // to remove from a queue -> queue.poll(); -> returns oldest item

        // These are relatively simple data structures. If you need to do something relatively complicated, use a list. Stack and Queue can be useful when you need to retain order.

        // example of queue -> IT ticketing system. The earliest tickets need to be resolved first.

        // example of stack -> browser back button or undo functionality

        // if stack or queue is empty, there are 0 things in it
        // if we run stack.push(e) or queue.offer(e), each will have 1 thing in it.
        // stack.pop() and queue.poll() are destructive. They REMOVE elements from the collection, not just retrieve elements.
        // You don't go looking for anything, you don't run a for each loop over them, you just retain order.

        // .peek() applies to both stacks and queues. It returns the element that would be returned by pop() or poll(), but it does not destroy the element.

        System.out.println();
        System.out.println("######################");
        System.out.println("        OUEUES        ");
        System.out.println("######################");
        System.out.println();

        Queue<String> todos = new LinkedList<>();
        todos.offer("Wash the dishes");
        todos.offer("Sweep the leg");
        todos.offer("Sweep the floor");
        todos.offer("Wake up");
        todos.offer("Grab a brush");

        System.out.println("Current Queue size: " + todos.size());

        String nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);

        System.out.println("Current Queue size: " + todos.size());

        String peekNextTodo = todos.peek();

        System.out.println("Queue peek() next todo (still fifo) -> " + peekNextTodo);

        System.out.println("Current Queue size: " + todos.size());

        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);


        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);

        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);


        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);

        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);

        System.out.println("Current Queue size: " + todos.size());

        nextTodo = todos.poll();

        System.out.println("Queue poll() next todo (first in first out) -> " + nextTodo);


        System.out.println();

        // common to use a while loop to process queue elements

        Queue<String> names = new LinkedList<>();
        names.offer("jim");
        names.offer("mark");
        names.offer("paul");
        names.offer("peter");
        names.offer("elizabeth");

        while (names.size() > 0) {
            String name = names.poll();
            System.out.println("current name: " + name);
            System.out.println("current size: " + names.size());
        }




        System.out.println();
        System.out.println("######################");
        System.out.println("        STACKS        ");
        System.out.println("######################");
        System.out.println();

        // stacks are similar to queues, but they do things in the opposite order

        Stack<String> browserHistory = new Stack<>();


        browserHistory.push("www.techelevator.com");
        browserHistory.push("www.techelevator.com/pittsburgh");
        browserHistory.push("www.google.com");
        browserHistory.push("www.reddit.com");

        String previousPage = browserHistory.pop();
        System.out.println("Previous page: " + previousPage);

        previousPage = browserHistory.pop();
        System.out.println("Previous page: " + previousPage);

        previousPage = browserHistory.pop();
        System.out.println("Previous page: " + previousPage);

        previousPage = browserHistory.pop();
        System.out.println("Previous page: " + previousPage);

        // cannot exceed the limit of the stack. will get an EmptyStackException

        System.out.println();

        Stack<String> actionBuffer = new Stack<>();
        actionBuffer.push("paste");
        actionBuffer.push("delete");
        actionBuffer.push("update");
        actionBuffer.push("delete");

        while (!actionBuffer.isEmpty()) {
            String undo = actionBuffer.pop();
            System.out.println("Undone action: " + undo);
            System.out.println("stack size: " + actionBuffer.size());
        }





        System.out.println();
        System.out.println("######################");
        System.out.println("         MAPS         ");
        System.out.println("######################");
        System.out.println();

        // MAPS

        // A Map is a java collection
        // has two parts
        // they are key/value pairs

        // keys have a data type
        // values can have a different data type

        //   key     value
        Map<String, String> vendingMachine = new HashMap<>();

        // Maps are a non-linear data structure
        // if we put data into a map, we need to be able to get it out.
        // because it's non linear, we cannot use an index, we cannot use a for loop

        // so we retrieve values by key

        // It's in the name. You are mapping values to keys

        // Think of a vending machine
        // keys are the buttons
        // values are the item that is returned when you press a given button.

        // values can have duplicates
        // keys CANNOT have duplicates. They must be unique.

        vendingMachine.put("A1", "oreos");
        vendingMachine.put("A2", "doritos");
        vendingMachine.put("B1", "pepsi");
        vendingMachine.put("C4", "oreos");

        System.out.println("Item at A1: " + vendingMachine.get("A1"));
        System.out.println("Item at A2: " + vendingMachine.get("A2"));
        System.out.println("Item at B1: " + vendingMachine.get("B1"));
        System.out.println("Item at C4: " + vendingMachine.get("C4"));


        // you can reassign the values for any given key

        // C# calls maps dictionaries
        // word maps to definition
        // different mental model, same concept


        // sometimes called HashTables
        // sometimes called AssociativeArrays

        System.out.println();

        Map<Integer, String> zipToCity = new HashMap<>();

        System.out.println("zipToCity Map size when empty: " + zipToCity.size());

        zipToCity.put(15222, "Downtown");
        zipToCity.put(15203, "South Side");
        zipToCity.put(15201, "Hipsters");
        zipToCity.put(15233, "Northside");

        System.out.println("zipToCity size after adding 4 pairs: " + zipToCity.size());

        // Get takes in a Key and returns a Value
        String area = zipToCity.get(15222);
        System.out.println("15222 area: " + area);


        System.out.println();
        System.out.println("Getting all values using a for each loop...");

        // retrieve all map pairs using a for each loop
        // iterate through all the keys
        for (Integer zip : zipToCity.keySet()) {
            // you can overwrite map values in a for each loop

            // however, I cannot add or remove elements
            System.out.println(zip + " area: " + zipToCity.get(zip));
        }

        // note that map.get() is not destructive like when we pop or poll a stack or queue
        // pairs remain in the list

        // there is no ordering
        // when using a map, we do not care about order
        // java is taking care of storing the key/value pairs in the fastest way possible
        // java has an internal mechanism called hashing, which is basically taking an entire object and boiling it down to one number
        // whatever mechanism java uses to come up with that order does not result in a human obvious order.

        // order in a list is important, because things are being stored NEXT to each other in memory.
        // for example, if we have a list of Integers...
        // each integer is 32 bits, so we know that if index 0 starts at 0 bits, index 1 will start at 32 bits, and index 2 will start at 64 bits, and so on. Java knows the list needs to hold Integers, and it knows Integers are 32 bits in size, so it knows to set aside enough space to hold each integer at a given index in the list.

        // maps do not work that way.

        zipToCity.put(15201, "Larrytahn");

        // If I try to put something with the same key, the old value will be overwritten with the new value.
        // put() method creates data which wasn't there before, and it updates existing data already mapped to a key.
        System.out.println(zipToCity.get(15201));

        System.out.println();
        System.out.println("=========================");
        System.out.println("=========================");

        // key does not exist, getting by that key will return null
        String example = zipToCity.get(90210);
        System.out.println(example);

        if (zipToCity.containsKey(90210)) {
            System.out.println(zipToCity.get(90210) + " rolling like a celebrity!");
        } else {
            System.out.println("Beverly Hills does not exist!");
        }

        System.out.println("########################");
        System.out.println("          SETS          ");
        System.out.println("########################");
        System.out.println();


        // SET: unordered list -> NO DUPLICATES ALLOWED
        Set<String> instructors = new HashSet<>();
        instructors.add("Tom");
        instructors.add("Tom");
        instructors.add("Walt");

        // order is determined by Java, so there is no reliable index
        // therefore we cannot use a for loop
        // but we can use a for each loop

        for (String instructor : instructors) {
            // Only outputs one Tom and one Walt
            // No duplicates, so the java just does no add the second Tom
            System.out.println(instructor + " works at TE PGH!");
        }

        // What is the benefit of a set?
        // removal of duplicates basically.
        // if you need to find all unique values, you can add all elements to a set

        // keys in a map are a keySet.
        // map keys are stored in a set (which is how no duplicate keys is enforced). Keys are not stored in a list.

        // wouldn't it be better to declare a HashMap rather than a generic map?
        // like
        HashMap<Integer, String> testMap1 = new HashMap<>();
        Map<Integer, String> testMap2 = new HashMap<>();

        // no
        // if I wanted to change the type of map from HashMap to TreeMap, we'd have to change the instantiation and the declaration rather than just the instantiation.
        // best practice is to use general data types in declarations and specific data types in instantiation.

        // diff between HashMap and TreeMap...
        // TreeMap is slightly slower and will keep the keys sorted.

        // linkedHashMap will preserve the order in which key/value pairs are added.

        // HashMaps are most common, because usually when we use a map we don't care about order, and hash maps are more performant.


    }
}
