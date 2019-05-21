
public class Main {
	static int methodCount = 0;
	static String className = null;

	public static void main(String[] args) {
		int mainInt = 1;
		
		System.out.println("Hello World!");
		System.out.println("Method Count: " + methodCount);
		System.out.println("Class Name: " + className);
		
		methodCount += mainInt;
		System.out.println("Method Count: " + methodCount);
		
		float f1 = 845.4f;
		int castFloat = (int)f1;
		
		System.out.println("Float: " + f1 + ", Cast float: " + castFloat);
	}

}
