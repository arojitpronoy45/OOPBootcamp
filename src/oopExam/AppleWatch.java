package oopExam;

/*
 write inside multiple line comments what you know about Abstract class
 // Abstract class starts with Upper class
  * Abstract class can inherit only one abstract or regular class by extends keyword
  * Abstract class cannot inherit an interface by extends keyword
  * Abstract class can inherit more than one interface by implements keyword
  * Abstract class cannot inherit a regular or abstract class by implements keywords
  * Apple watch is an abstract class and it can inherit Watch, DigitalWatch by implements keyword
  * AppleWatch can inhrit AppleWatchSeries5 by extends keyword
 */

public abstract class AppleWatch {
	/*
	 * Variable can be declared and Initialized inside abstract class Constructor is
	 * allowed inside abstract class Constructor can also be instantiated by only
	 * concrete class
	 */

	public void abstractClassInfo() {
		System.out.println("\nFeatures of an interface:");
		System.out.println("- Interfaces can only declare abstract methods.");
		System.out.println("- Interfaces cannot have constructors.");
		System.out.println("- Interfaces do not have instance variables with default values.");
		System.out.println("- A class can implement multiple interfaces.");
		System.out.println("\nFeatures of an abstract class:");
		System.out.println("- Abstract classes can have both abstract and non-abstract methods.");
		System.out.println("- Abstract classes can have constructors.");
		System.out.println("- Abstract classes can have instance variables with default values.");
		System.out.println("\nFeatures of a regular class:");
		System.out.println("- Regular classes can have both abstract and non-abstract methods.");
		System.out.println("- Regular classes can have constructors.");
		System.out.println("- Regular classes can have instance variables with default values.");

	}

	public abstract void appleWatchInfo();
}
