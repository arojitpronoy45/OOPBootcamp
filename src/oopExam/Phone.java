package oopExam;

/*
 *  Interface starts with Uppercase 
 *  Interface is a blueprint of class
 *  Interface cannot be instantiated 
 *  Interface is a collection of methods that can be defined but not implemented
 *  Contains only abstract methods 
 */

public interface Phone extends Pager, Wakitoki {
	/*
	 * An interface cannot declare a variable 
	 * Also an Interface cannot have constructors
	 */

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default method from Java");
	}

	public default void wireless() {
		System.out.println("wireless is a default method from Java");
	}
}
