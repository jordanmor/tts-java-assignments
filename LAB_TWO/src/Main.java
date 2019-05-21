
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* =====-=====-=====-=====-=====
		 			   STEP 1
	   	   =====-=====-=====-=====-===== */
		
		// Declare an int variable (firstInt) and assign it the value of 6.
		int firstInt = 6;
		
		// Declare another int variable (secondInt) and assign it the value of 20.
		int secondInt = 20;
		
		// Declare another int variable (thirdInt) and don't assign it any value.
//		int thirdInt;
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
		
		/* =====-=====-=====-=====-=====
		   			   STEP 2
           =====-=====-=====-=====-===== */
		
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
		
		/* =====-=====-=====-=====-=====
		   			  STEP 3
		   =====-=====-=====-=====-===== */
		
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
		
		/* =====-=====-=====-=====-=====
			  		   STEP 4
		   =====-=====-=====-=====-===== */
		
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

}
 