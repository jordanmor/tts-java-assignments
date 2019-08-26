package com.tts.techtalentsouth;

public class LabTwo {
    public static void main(String[] args) {
        runExerciseOne();
        // runExerciseTwo();
        // runExerciseThree();
        // anotherMethod(args);
        // playWithStrings(args);
    }

    public static void runExerciseOne() {
        // Declare an int variable (firstInt) and assign it the value of 6.
        int firstInt = 6;

        // Declare another int variable (secondInt) and assign it the value of 20.
        int secondInt = 20;

        // Declare another int variable (thirdInt) and don't assign it any value.
        // int thirdInt;
        int thirdInt = 0;

        // Declare a float variable and assign it the value of 4.4f.
        float myFloat = 4.4f;

        // Declare a boolean value for `isCold` and set it to false.
        boolean isCold = false;

        // Declare a double value and assign it using the "_" character for group separation.
        double myDouble = 1_343_423_423;

        // Print out the value of each variable using the `System.out.println` statement.
        System.out.println(firstInt); // 6
        System.out.println(secondInt); // 20
        System.out.println(thirdInt); // causes error if not assigned a value;
        System.out.println(myFloat); // 4.4
        System.out.println(isCold); // false
        System.out.println(myDouble); // 1.343423423E9

        // Create a new value by adding firstInt to secondInt and print the result.
        System.out.println((firstInt + secondInt)); // 26

        // Create a new value by adding firstInt to thirdInt and print the result.
        System.out.println((firstInt + thirdInt)); // 6

        // Print the result of dividing firstInt into secondInt.
        System.out.println((secondInt / firstInt)); // 3

        // Print the remainder when dividing firstInt into secondInt.
        int remainder = secondInt % firstInt;
        System.out.println(remainder); // 2

        // Create a new int and add firstInt to the remainder from the previous statement.
        // Before printing, increment the value by 1;
        int newInt = firstInt + remainder;
        newInt++;
        System.out.println(newInt); // 9
    }

    public static void runExerciseTwo() {
        // Declare and int variable x and assign it the value of 100;
        int x = 100;

        // Declare a boolean variable and assign it the value of comparing x to the value of 100.
        boolean booVar = x == 100;

        // Declare a variable y and assign it a value of 106.
        int y = 106;

        /*
         * Check and print the following conditions:
         * x greater than y
         * y greater than x
         * x greater than or equal to y-6
         * */

        System.out.println("x is greater than y: " + (x > y)); // false
        System.out.println("y is greater than x: " + (y > x)); // true
        System.out.println("x is greater than or equal to y-6: " + (x >= y - 6)); // true

        // Create a variable z and set it to 92.
        int z = 92;

        /*
         * Check and print the following conditions:
         * x is less than y and y is less than z
         * y is less than z and x is greater than or equal to y
         * z is greater than y + x or x - y is less than z
         * */

        System.out.println("x is less than y and y is less than z: " + (x < y && y < z)); // false
        System.out.println("y is less than z and x is greater than or equal to y: " + (y < z && x >= y)); // false
        System.out.println("z is greater than y + x or x - y is less than z: " + (z > y + x || x - y < z)); // true

        // Prove that x less than y is equal to NOT x greater than y.
        System.out.println("x less than y is NOT equal to x greater than y: " + (x < y != x > y)); // true
        // Prove that x less than y is equal to NOT x greater than y.
        System.out.println("x less than y is equal to NOT x greater than y: " + (x < y == !(x > y))); // true
    }

    public static void runExerciseThree() {

        // Create an integer variable n and assign it 64
        int n = 64;

        // Prove that shifting n 1 bit right is equivalent to dividing by 2.
        System.out.println((n>>1 == n / 2)); // true

        // Prove that shifting n 1 bit left is equivalent to multiplying by 2.
        System.out.println((n<<1 == n * 2)); // true
        // Change the value of n to a non-power-of-2 number, such as 40, and prove that the two previous statements are still valid.
        n = 40;
        System.out.println((n>>1 == n / 2)); // true
        System.out.println((n<<1 == n * 2)); // true

        // Prove that shifting by 2 is equivalent to dividing/multiplying by 4.
        System.out.println((n<<2 == n * 4)); // true

        // Change the value to an odd number and print the values to see what happens.
        n = 35;
        System.out.println((n>>1 == n / 2)); // true
        System.out.println((n<<1 == n * 2)); // true
    }

    public static void anotherMethod(String[] args) {

        // Declare an int variable inside of the `anotherMethod` method and assign it a value.
        // With the current code is it possible to reference that variable from inside `main()`?
        int numFour = 4; // it is NOT possible to reference this variable inside main() with the current code.
        // Below the variable, create an `if` statement to test if the variable you just declared is greater than 1000.
        // If it is print "Big Value", if it is not print "Not a big value".
        if(numFour > 1000) {
            System.out.println("Big Value");
        } else {
            System.out.println("Not a big value");
        }

        // Change the statement to use the variable in the output: (n + " is a Big value") or (n + " is not a big value")
        int ifBlockVar = numFour / 2;
        if(numFour > 1000) {
            System.out.println(numFour + " is a Big Value");
            System.out.println(ifBlockVar + " is half a big variable");
        } else {
            System.out.println(numFour + " is not a big value");
            System.out.println(ifBlockVar + " is definitely small");
        }

        /* Inside of the if block, create an integer variable and assign it the value of the previously declared integer divided by 2.
         Inside of the if block, print that the newly declared variable is half a big variable.
         In the else block, print that the half value is definitely small. Oops, is there a problem?  How can it be fixed?
         Call this method from the `main()` method to see its output. */

        // In the `anotherMethod()`, change the primitive `int` to be a `Integer` variable.
        // Instead of a hard-coded 1000, create an `Integer` variable to check against, but use the string value "1000" to create the `Integer`.
        Integer varCheckAgainst = Integer.parseInt("1000");

        // Instead of using the greater than for comparison in the `if()`, use either the static `compare` method,
        // or the instance `compareTo` method to perform the check in the `if()`.
        if(Integer.compare(numFour, varCheckAgainst) == 0) {
            System.out.println(numFour + " is a Big Value");
            System.out.println(ifBlockVar + " is half a big variable");
        } else {
            System.out.println(numFour + " is not a big value");
            System.out.println(ifBlockVar + " is definitely small");
        }
    }

    // Create another static void method - `playWithStrings()`
    public static void playWithStrings(String[] args) {

        // Create a `String` variable to represent your first name and initialize it with a string literal.
        String firstName = "Harry";

        // Create a `String` variable to represent your last name and initialize it by using `new()` with your last name.
        String lastName = new String("Potter");

        // Using the `concat()` method, print a greeting of "Hello firstName lastName"
        // Call the method from `main()` and inspect the results.
        System.out.println(firstName.concat(" " + lastName));

        // Change the println method to use the overloaded "+" operator to make the same output string.
        System.out.println(firstName  + " " + lastName);

        // Create a new String variable `fullName` by combining the first and last with proper spacing.
        String fullName = firstName  + " " + lastName;

        // This variable will be used for many of the following exercises:
        // Find and the following values:

        // What is the total length of the string?
        System.out.println(fullName.length()); // 12

        // Index of the first 'o'
        System.out.println(fullName.indexOf('o')); // 7

        // Which letter is at position 7?
        System.out.println(fullName.charAt(6)); // P

        // Does the full name contain the word "son"?
        System.out.println(fullName.contains("son")); // false

        // What are the last 5 letters in the full name?
        System.out.println(fullName.substring(fullName.length() - 5)); // otter

        // Does the full name contain an apostrophe or dash?
        System.out.println(fullName.matches(".*[-'].*")); // false

        String stringTwo = "Harry's Wand";
        System.out.println(stringTwo.matches(".*[-'].*")); // true

        /*
         * Print the above values using format strings, in complete sentence form.  For example:
         * "The total length of the String Tim Smith is 9".
         * "The String Tim Smith does not have an 'o'".
         * "The letter "t" is at position 7.
         * etc.
         */

        System.out.println(String.format("The total length of the string Harry Potter is %d.", fullName.length()));
        // The total length of the string Harry Potter is 12.
        System.out.println(String.format("The index of the first o is %d.", fullName.indexOf('o')));
        // The index of the first o is 7.
        System.out.println(String.format("The letter at position 7 is %c.", fullName.charAt(6)));
        // The letter at position 7 is P.
        String doesItContain = fullName.contains("son") ? "contains" : "does not contain";
        System.out.println(String.format("The name Harry Potter %s the word \"son\".", doesItContain));
        // The name Harry Potter does not contain the word "son".
        System.out.println(String.format("\"%s\" are the last 5 letters of the full name", fullName.substring(fullName.length() - 5)));
        // "otter" are the last 5 letters of the full name
        doesItContain = fullName.matches(".*[-'].*") ? "contains" : "does not contain";
        System.out.println(String.format("The name \"Harry Potter\" %s an apostrophe or dash.", doesItContain));
        // The name Harry Potter does not contain an apostrophe or dash.
        doesItContain = stringTwo.matches(".*[-'].*") ? "contain" : "do not contain";
        System.out.println(String.format("The words \"Harry's Wand\" %s an apostrophe or dash.", doesItContain));
        // The words "Harry's Wand" contain an apostrophe or dash.
    }
}
