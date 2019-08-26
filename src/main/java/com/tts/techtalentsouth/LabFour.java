package com.tts.techtalentsouth;

import java.util.Objects;
import java.util.Scanner;

public class LabFour {

    // scanner reads input from the command line through various methods
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runExerciseOne();
        // runExerciseTwo();
        // runExerciseThree();
        // runExerciseFour(22);
        // runExerciseFive(20);
    }

    public static void runExerciseOne() {
        /*
         * Add a series of `if() statements that will check and output the following:
         * 	- if 16 or older, print "You are old enough to drive"
         *  - if 18 or older, print "You are old enough to vote"
         *  - if 21 or older, print "You are old enough to drink"
         *  - if 35 or older, print "You are old enough to be President"
         *  - if 55 or older, print "You can join AARP"
         *  - if 67 or older, print "You can starting drawing Social Security"
         * The output should be progressive
         * Add else statements to each test that prints the negative of each condition.
         * In this case there should be 6 statements each run combining both positive and negative responses depending on age.
         */

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Hello %s, your age is %d", username, age));

        if(age > 16) {
            System.out.println("You are old enough to drive.");
        } else {
            System.out.println("You are not old enough to drive.");
        }

        if(age > 18) {
            System.out.println("You are old enough to vote.");
        } else {
            System.out.println("You are not old enough to vote.");
        }

        if(age > 21) {
            System.out.println("You are old enough to drink.");
        } else {
            System.out.println("You are not old enough to drink.");
        }

        if(age > 35) {
            System.out.println("You are old enough to be President.");
        } else {
            System.out.println("You are not old enough to be President.");
        }

        if(age > 55) {
            System.out.println("You can join AARP.");
        } else {
            System.out.println("You can not join AARP.");
        }

        if(age > 67) {
            System.out.println("You can start drawing Social Security.");
        } else {
            System.out.println("You can not start drawing Social Security.");
        }

        /* To the statements above add more questions:
         * - Prompt the user to enter 'E', 'U', or 'S' for employment status - employed, unemployed, or student.
         * - Do you have a car, truck, suv, or do not own a vehicle? (make up your own one letter responses for this).
         * Using `switch` statements, print out a sentence for each of the choices above - such as "You are employed" and "You own an SUV".
         */

        // prompt and read a string
        System.out.print("What is your employment status? Enter E for Employed, U for Unemployed or S for student: ");
        String employmentStatus = scanner.next();

        System.out.print("What vehicle do you own? Enter C for Car, T for Truck, S for SUV or N for None: ");
        String vehicleStatus = scanner.next();

        switch(employmentStatus) {
            case "E":
                System.out.println("You are employed.");
                break;
            case "U":
                System.out.println("You are unemployed.");
                break;
            case "S":
                System.out.println("You are unemployed.");
                break;
        }

        switch(vehicleStatus) {
            case "C":
                System.out.println("You own a car.");
                break;
            case "T":
                System.out.println("You own a truck.");
                break;
            case "S":
                System.out.println("You own an SUV.");
                break;
            case "N":
                System.out.println("You do not own a vehicle.");
                break;
        }
    }

    public static void runExerciseTwo() {
            // Declare an integer array with 30 elements
            // With a `for` loop, initialize the array with the same number as the index. [0] = 0, [1] = 1, etc.
            // Print out the contents of each element of the array using an enhanced `for`
            System.out.println("For Loop Exercise 1: ");
            int[] myArray = new int[30];

            for(int x = 0; x < myArray.length; x++) {
                myArray[x] = x;
            }
            for(int item: myArray) {
                System.out.println(item);
            }

            // With a `for` loop, reassign the elements of the array with the even numbers up to 60.
            // Print out the contents of each element of the array using an enhanced `for`
            System.out.println("For Loop Exercise 2f: ");
            for(int x = 0; x < myArray.length; x++) {
                myArray[x] = (x * 2) + 2;
            }
            for(int item: myArray) {
                System.out.println(item);
            }
            // Print the contents of the array in reverse order.
            for(int x = myArray.length - 1; x >= 0; x--) {
                System.out.println(myArray[x]);
            }

            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Write the last two statements from the previous step - forward enhanced for and reverse order, using `while` loops.
            System.out.println("While Loop Exercise 1: ");
            int arrayIndex = 0;
            while(arrayIndex < myArray.length) {
                System.out.println(myArray[arrayIndex]);
                arrayIndex++;
            }

            System.out.println("While Loop Exercise 2: ");
            arrayIndex = myArray.length - 1;
            while(arrayIndex >= 0) {
                System.out.println(myArray[arrayIndex]);
                arrayIndex--;
            }
    }

    public static void runExerciseThree() {
        // Redo the `main()` method shown in step 1, but surround it with a do-while loop.
        // The last statement in the loop should be a question - "Do you want to answer the questions again?"
        // Use the input to either do the loop again or quit.

        boolean repeat = false;
        String answer = null;

        do {
            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println(String.format("Hello %s, your age is %d", username, age));

            if(age > 16) {
                System.out.println("You are old enough to drive.");
            } else {
                System.out.println("You are not old enough to drive.");
            }

            if(age > 18) {
                System.out.println("You are old enough to vote.");
            } else {
                System.out.println("You are not old enough to vote.");
            }

            if(age > 21) {
                System.out.println("You are old enough to drink.");
            } else {
                System.out.println("You are not old enough to drink.");
            }

            if(age > 35) {
                System.out.println("You are old enough to be President.");
            } else {
                System.out.println("You are not old enough to be President.");
            }

            if(age > 55) {
                System.out.println("You can join AARP.");
            } else {
                System.out.println("You can not join AARP.");
            }

            if(age > 67) {
                System.out.println("You can start drawing Social Security.");
            } else {
                System.out.println("You can not start drawing Social Security.");
            }

            // prompt and read a string
            System.out.print("What is your employment status? Enter E for Employed, U for Unemployed or S for student: ");
            String employmentStatus = scanner.next();

            System.out.print("What vehicle do you own? Enter C for Car, T for Truck, S for SUV or N for None: ");
            String vehicleStatus = scanner.next();

            switch(employmentStatus) {
                case "E":
                    System.out.println("You are employed.");
                    break;
                case "U":
                    System.out.println("You are unemployed.");
                    break;
                case "S":
                    System.out.println("You are unemployed.");
                    break;
            }

            switch(vehicleStatus) {
                case "C":
                    System.out.println("You own a car.");
                    break;
                case "T":
                    System.out.println("You own a truck.");
                    break;
                case "S":
                    System.out.println("You own an SUV.");
                    break;
                case "N":
                    System.out.println("You do not own a vehicle.");
                    break;
            }

            System.out.print("Do you want to answer the questions again? Y or N: ");
            answer = scanner.next().toLowerCase();
            if(Objects.equals(answer, "y")) {
                repeat = true;
            } else {
                repeat = false;
            }

        } while(repeat);

        System.out.println("While Loop Over");
    }

    // Create a void method that takes an integer as an argument.
    public static void runExerciseFour(int number) {
        /*
         *  Loop through the array created in step 3.  Perform the following
         *  - if the number is even, print it.
         *  - if the number is odd, skip it.
         *  - if the number is equal to the number passed in the method, quit processing.
         */

        int[] myArray = new int[30];

        for(int x = 0; x < myArray.length; x++) {
            myArray[x] = x;
        }

        for(int item: myArray) {
            if(item == number) {
                System.out.println("The program quit processing because the loop reached the chosen argument: " + number);
                break;
            } else if(item % 2 == 0) {
                System.out.println(item);
            }
        }

    }

    /*
     * Change the method as follows:
     * - if the number is odd, print it.
     * - if the number is even, add it to a running total of even numbers.
     * - if the number is equal to the number passed in the method, return the running total sum from the method.
     * Run some tests, including printing out the return value from the method.
     */
    public static int runExerciseFive(int number) {
        int[] myArray = new int[30];

        for(int x = 0; x < myArray.length; x++) {
            myArray[x] = x;
        }

        int sum = 0;

        for(int item: myArray) {
            if(item == number) {
                break;
            } else if(item % 2 == 0) {
                sum += item;
            } else {
                System.out.println(item);
            }
        }
        return sum;
    }
}
