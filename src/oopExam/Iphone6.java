package oopExam;

/*
 * Iphone6 class inherit from iphone5 by extends keyword
 * When different methods exist with the same method name but
 * with different parameters or signature, it is known as method overloading
 * Method Overloading occurs during compile time.
 * 
 * When different methods exist with the same method name with same parameters
 * or signature but with different syntax or logic it is knwon as method
 * overriding Method Overriding occurs during run time
 * 
 * 
 *
 * 
 */

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println("\n------------------------Compass was introduced in 2004 on Iphone6------------------------");
	}

	public int materials(int ramPrice, String cameraPrice) {
		int total1 = ramPrice + Integer.parseInt(cameraPrice);
		System.out.println("Total numbers from materials: " + total1);
		return total1;
	}

	public int materials(int ramPrice, int cameraPrice) {
		int total2 = ramPrice + cameraPrice;
		System.out.println("Total numbers from materials: " + total2);
		return total2;
	}

	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total3 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total3);
		return total3;
	}

	public int materials(int ramPrice, String cameraPrice, int ProcessorPrice) {
		int total4 = ramPrice + Integer.parseInt(cameraPrice) + ProcessorPrice;
		System.out.println("Total numbers from materials: " + total4);
		return total4;
	}

	public int materials(String ramPrice, int cameraPrice, String ProcessorPrice) {
		int total5 = Integer.parseInt(ramPrice) + cameraPrice + Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total5);
		return total5;
	}

	public int materials(int ramPrice, String cameraPrice, String ProcessorPrice) {
		int total6 = ramPrice + Integer.parseInt(cameraPrice) + Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total6);
		return total6;
	}

	/*
	 * We cannot use voit type parameterized return type Void type parameterized is
	 * implemented
	 */

	public final int materials(int ramPrice, int cameraPrice, int ProcessorPrice) {
		int total7 = ramPrice + cameraPrice + ProcessorPrice;
		System.out.println("Total numbers from materials: " + total7);
		return total7;

	}

	public static int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int maintenanceCost) {
		int total8 = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + maintenanceCost;
		System.out.println("Total numbers from materials: " + total8);
		return total8;
	}

	public void materials(int ramPrice, String cameraPrice, int ProcessorPrice, int a) {
		int total9 = ramPrice + Integer.parseInt(cameraPrice) + ProcessorPrice + a;
		System.out.println("Total numbers from materials: " + total9);
	}

	public void materials() {
		System.out.println("Void method materials");
	}

}
