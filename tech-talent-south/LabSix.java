package com.tts_java_labs;

import java.util.*;

public class LabSix {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runExerciseOne();
        // runExerciseTwo();
        // runExerciseThree();
        // runExerciseFour();
        // runExerciseFive();
        // runExerciseSix();
        // runExerciseSeven();
    }

    public static void runExerciseOne() {

        // Declare a primitive int array and initialize it with `{1, 3, 4, 6, 0, 11}`.
        // Create a for loop to print out the values.  Use both a traditional `for` and an enhanced `for`.
        int[] array = new int[] {1, 3, 4, 6, 0, 11};
        System.out.println("Print out array values from traditional for loop:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Print out array values from enhanced for loop:");
        for(int number: array) {
            System.out.println(number);
        }
    }

    public static void runExerciseTwo() {
        // Create an `ArrayList` of Strings.  Enter into a loop and prompt the user to enter a simple word, or "QUIT" to exit the loop.
        // For each word, add it to the list of Strings.  Once the user enters "QUIT" print out the entire list entered by the user.

        ArrayList<String> wordArrList = new ArrayList<>();

        boolean repeat = true;
        do {
            System.out.print("Please enter a simple word or enter QUIT to exit program: ");

            if(scanner.hasNext("QUIT")) {
                scanner.next();
                repeat = false;
                if(!wordArrList.isEmpty()) {
                    System.out.println(wordArrList.toString());
                }
            } else {
                wordArrList.add(scanner.next());
            }

        } while(repeat);
    }

    public static void runExerciseThree() {

        // Change the above code to have the user search for a word they just entered.
        // Once they type "QUIT" to exit the loop, do not print the loop, but ask them to search for a word in the list.
        // With their response, use the `contains()` method to search the ArrayList and print whether or not the list contains their word.

        ArrayList<String> wordArrList = new ArrayList<>();

        String word;
        boolean repeat = true;
        do {
            System.out.print("Please enter a simple word or enter QUIT to exit program: ");

            if(scanner.hasNext("QUIT")) {
                scanner.next();
                repeat = false;
                System.out.print("Please search for a word in your list: ");
                if(!wordArrList.isEmpty()) {
                    word = scanner.next();
                    if(wordArrList.contains(word)) {
                        System.out.println("Your list contains the word " + word);
                    } else {
                        System.out.println("Your list does not contain the word " + word);
                    }
                } else {
                    System.out.println("You have not entered any words into your list");
                }
            } else {
                wordArrList.add(scanner.next());
            }

        } while(repeat);
    }

    public static void runExerciseFour() {
        // Create two variables to represent a Queue and a Stack
        // Study the following code to see the difference in the methods and the difference in storage order
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();

        queue.add("Queues");
        queue.add("are");
        queue.add("First In ");
        queue.add("First Out");

        for ( String s: queue) {
            System.out.println(s);
        }

        String rem = queue.remove(); System.out.println("so removed gives: " + rem);

        stack.push("Stacks");
        stack.push("are");
        stack.push("First In ");
        stack.push("Last Out");

        for ( String s: stack) {
            System.out.println(s);
        }

        rem = stack.pop();
        System.out.println("So pop gives: " + rem);
    }

    public static void runExerciseFive() {

        // Study the code below to become familiar with the usage of the LinkedList class

        LinkedList<String> strList = new LinkedList<>();

        strList.add("Hello");
        strList.add("From");
        strList.add("Linked");
        strList.add("Lists");
        strList.add("Do you even");
        strList.add("know you are using");
        strList.add("a list?");

        for(String s: strList) {
            System.out.println(s);
        }

        System.out.println("First list entry is: " + strList.getFirst());
        System.out.println("List list entry is: " + strList.getLast());
        System.out.println("Size is: " + strList.size());
    }

    public static void runExerciseSix() {

        // Enter and run the following code to exercise the Vector class:

        Vector<String> vecStr = new Vector<>();

        vecStr.add("Hello");
        vecStr.add("From");
        vecStr.add("Linked");
        vecStr.add("Lists");
        vecStr.add("Do you even");
        vecStr.add("know you are using");
        vecStr.add("a vector?");

        for(String s: vecStr) {
            System.out.println(s);
        }

        int size = vecStr.size();
        int cap = vecStr.capacity();

        System.out.println("Size is: " + size);
        System.out.println("Capacity is: " + cap);

        // Notice the output. To provide more output and get an idea of how the capacity is changed, add the additional lines below:

        vecStr.add("more");
        vecStr.add("random");
        vecStr.add("Strings");
        vecStr.add("inserted");

        size = vecStr.size();
        cap = vecStr.capacity();

        System.out.println("Size is: " + size);
        System.out.println("Capacity is: " + cap);

        // Add strings and get the values at the index of size (remember 0 based) and capacity. What happens?
        vecStr.add("adding");
        vecStr.add("even");
        vecStr.add("more");
        vecStr.add("Strings");

        String valueOne = vecStr.get(size); // returns adding
        System.out.println("The first value with index of size is : " + valueOne);

        String valueTwo = vecStr.get(cap); // array index out of range: 20
        System.out.println("The second value with index of capacity is :" + valueTwo);
    }

    public static void runExerciseSeven() {
        // For Hashmaps, enter the following code and run the program:

        HashMap<Integer, String> hmIdVal = new HashMap<>();

        hmIdVal.put(1, "Value 1");
        hmIdVal.put(2, "Value 2");
        hmIdVal.put(3, "Value 3");
        hmIdVal.put(4, "Value 4");
        hmIdVal.put(8, "Value 8");

        String val8 = hmIdVal.get(8);
        System.out.println("Value at 8: " + val8);
        String val5 = hmIdVal.get(5);
        System.out.println("Value at 5: " + val5);
        String val6 = hmIdVal.getOrDefault(6, "No Value Found");
        System.out.println("Value at 6: " + val6);

        HashMap<String, String> hmStrStr = new HashMap<>();

        hmStrStr.put("King", "George");
        hmStrStr.put("Prince", "Charming");
        hmStrStr.put("Queen", "Latifah");
        hmStrStr.put("Duke", "Earl");

        for(String str: hmStrStr.keySet()) {
            System.out.println("key: " + str + ", value: " + hmStrStr.get(str));
        }

        // Note:the order that the items are printed using the keySet() may ​not be the same order that they were inserted.
        // This further demonstrates the fact that for Hashmaps, the key use if for associated keys and values,
        // not necessarily for a guaranteed storage order.
    }

}
