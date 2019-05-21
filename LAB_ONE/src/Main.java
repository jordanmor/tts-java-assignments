// Start with a very basic class with main() method and Hello World!
public class Main {
	/* Declare two variables in the class:
	 *  - an integer named methodCount 
	 *   - a string variable named className
	 */
	static int methodCount = 0;
	static String className = null;

	public static void main(String[] args) {

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
		
		// Reuse the previous int values and declare them as follows with new values:
		x = y = 13;
		z = 15;
		
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
}
