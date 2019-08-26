package com.tts.techtalentsouth;

public class LabOne {
    /* Declare two variables in the class:
     *  - an integer named methodCount
     *  - a string variable named className
     */
    static int methodCount = 0;
    static String className = null;

    public static void main(String[] args) {
        runExerciseOne();
        // booleanOperators();
        // binaryOperators();
        // strings();
        // wrappers();
    }

    public static void runExerciseOne() {
        // Declare an integer variable inside of the main() method named mainInt.
        int mainInt = 1;

        System.out.println("Hello World!");
        // Write two statements to print out the value of each variable.
        System.out.println("Method Count: " + methodCount);
        System.out.println("Class Name: " + className);

        // Using the add-assignment operator, add the value of mainInt to methodCount
        // and print the value of methodCount to ensure the value is correct.
        methodCount += mainInt;
        System.out.println("Method Count: " + methodCount);

        // Declare a floating point variable inside of the main method
        // and initialize its value to 845.4f.
        float f1 = 845.4f;
        // Declare an integer and try to initialize it with the value of the floating point variable.
        int castFloat = (int)f1;
        System.out.println("Float: " + f1 + ", Cast float: " + castFloat);

        /*
         * The output of your program should be similar to this:
         *
         * Hello World!
         * Method count: 0
         * Class Name: null
         * Method count: 1
         * Float: 845.4, Cast float: 845
         */

        // Declare a couple of integer variables with initial values.
        // Add them together and place the result in a third variable. Then print that value.
        int x = 3;
        int y = 4;
        int z = x + y;
        System.out.println("z variable: " + z);

        /*
         * Construct three different statements:
         * x + y * z
         * (x + y) * z
         * x + (y * z)
         */

        System.out.println("Operation x+y*z result: " + x + y * z);
        System.out.println("Operation (x+y)*z result: " + (x + y) * z);
        System.out.println("Operation x+(y*z) result: " + x + (y * z));

        // Using the add-assignment operator, increment the value of x by 15 and print that value.
        x+= 15;
        System.out.println("x variable: " + x);
        // Next, increment the value of x by the value of y and print that value.
        x += y;
        System.out.println("x variable: " + x);
        // Type in the following z += (x*2)-6 and then print the value
        z += (x*2)-6;
        System.out.println("z variable: " + z);
    }

    public static void booleanOperators() {
        int y;
        int x = y = 13;
        int z = 15;

        /*
         * After that print the value of the following expressions:
         * x == y
         * x <= y
         * x != y
         * x > y
         * z < (x+y)
         * z > (x+2)
         */

        System.out.println("Value of x == y: " + (x == y));
        System.out.println("Value of x <= y: " + (x <= y));
        System.out.println("Value of x != y: " + (x != y));
        System.out.println("Value of x > y: " + (x > y));
        System.out.println("Value of z < (x+y): " + (z < (x+y)));
        System.out.println("Value of z > (x+2): " + (z > (x+2)));
    }

    public static void binaryOperators() {
        // For binary operators, write statements that will verify the first
        // 6 lines of the table on binary operations.

        int binaryOne = 50;
        int binaryTwo = 19;
        int binaryThree = 0;

        binaryThree = binaryOne & binaryTwo;
        System.out.println("BITWISE 50 AND 19 is: " + binaryThree); // 18

        binaryThree = binaryOne / binaryTwo;
        System.out.println("BITWISE 50 OR 19 is: " + binaryThree); // 2

        binaryThree = binaryOne ^ binaryTwo;
        System.out.println("BITWISE 50 XOR 19 is: " + binaryThree); // 33

        binaryThree = ~binaryOne;
        System.out.println("BITWISE 50 COMPLEMENT is: " + binaryThree); // 51

        binaryThree = binaryTwo<<2;
        System.out.println("BITWISE 19 SHIFT LEFT is: " + binaryThree); // 76

        binaryThree = binaryTwo>>>2;
        System.out.println("BITWISE 19 SHIFT RIGHT (NON CARRY) 2 is: " + binaryThree); // 4

        binaryThree = (-binaryOne)>>2;
        System.out.println("BITWISE 50 COMP SHIFT RIGHT (CARRY) 2 is: " + binaryThree); // -13

        binaryThree = (-binaryOne)>>>2;
        System.out.println("BITWISE 50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + binaryThree); // 1073741811
    }

    public static void strings() {
        // Declare three string variables, firstName , lastName , middle and initialize them with the appropriate values.
        // Print out each variable to ensure that the values are correct.

        // Initialize the first directly with a literal string
        String firstName = "Harry";
        System.out.println("First name: " + firstName);

        // Initialize the second with the new operator
        String lastName = new String("Potter");
        System.out.println("Last name: " + lastName);

        // Initialize the third with with assigning a value after initialization
        String middle;
        middle = "James";
        System.out.println("Middle name: " + middle);

        // Create a string called fullName that will be made from concatenating
        // the previous three values using the concat() method or the + operator.

        String fullName = firstName + " " + middle + " " + lastName;
        System.out.println("Full name: " + fullName);

        // Create three strings with the values of "James", "James" and james.
        String strOne = "James";
        String strTwo = "James";
        String strThree = "james";

        // Are the first two equal if you use the "==" operator?
        System.out.println((strOne == strTwo)); // true

        // How about the equals() method?
        System.out.println(strOne.equals(strTwo)); // true

        // What about the first and third if you use equals()?
        System.out.println(strOne.equals(strThree)); // false

        // How can you compare them and ignore the case?
        System.out.println(strOne.compareToIgnoreCase(strThree) == 0); // true - compareToIgnoreCase() returns 0 when true

        // Create a string with a full sentence of at least ten words.
        String tenWordSentence = "Here is really great sentence with ten, fantastic and imaginative words!";

        // Using that string and any resultant variables, carry out the following operations:

        // Check to see if the sentence contains the word 'and'.
        System.out.println(tenWordSentence.contains("and")); // true

        // Declare a char variable and put the 16th letter in it.
        char char16 = tenWordSentence.charAt(15);
        System.out.println(char16); // g

        // Declare an int variable and find the first instance of the letter 'u'.
        int indexOfFirstU = tenWordSentence.indexOf("u");
        System.out.println(indexOfFirstU); // -1 (there is no u in this sentence)

        // Declare an int variable and find the last instance of the letter 'c'.
        int indexOflastC = tenWordSentence.lastIndexOf("c");
        System.out.println(indexOflastC); // 48

        // Declare an int and find the total length of the string.
        int strLength = tenWordSentence.length();
        System.out.println(strLength); // 72

        // Does the sentence start with the word "The"?
        boolean starts = tenWordSentence.startsWith("The");
        System.out.println(starts); // false

        // Create a string variable that represents a template to print an integer.
        String strTemplate = String.format("The three integers in this string are %d, %d and %d.", 22, 89, 93);
        // Now use that template and an integer to print the template with the values of 22, 89, and 93.
        System.out.println(strTemplate); // The three integers in this string are 22, 89 and 93.
    }

    public static void wrappers() {
        // Declare an integer wrapper object and initialize it with the value of 42.
        Integer obj = 42;
        System.out.println(obj); // 42

        // Declare another wrapper object and initialize it from the literal "88".
        Integer obj2 = Integer.parseInt("88");
        System.out.println(obj2); // 88

        // Combine a wrapper class with a string substitution (and to prove out some of the earlier statements),
        // enter the following three lines and examine the output:

        int b1 = 10;
        int b2 = 20;
        Integer b3 = Integer.parseInt("30");

        b3 = b2>>2;
        System.out.println("19 SHIFT RIGHT (NON CARRY) 2 is: " + b3);
        System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
        b3 = (~b1)>>2;
        System.out.println("50 COMP SHIFT RIGHT (CARRY) 2 is: " + b3);
        System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
        b3 = (~b1)>>>2;
        System.out.println("50 COMP SHIFT RIGHT (NON CARRY) 2 is: " + b3);
        System.out.println(String.format("In binary %s", Integer.toBinaryString(b3)));
    }
}
