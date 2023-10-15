package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public void compass() {
		System.out.println("Compass was introduced in 2004 on Iphone6");
	}
	@Override
	public int materials(int ramPrice, String cameraPrice) {
		int total1 = ramPrice*Integer.parseInt(cameraPrice);
		System.out.println("Total numbers from materials: " + total1);
		return total1;
	}
	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total2 = ramPrice/cameraPrice;
		System.out.println("Total numbers from materials: " + total2);
		return total2;
	}
	@Override
	public int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
		int total3 = ramPrice+cameraPrice/Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total3);
		return total3;
	}
	@Override
	public int materials(int ramPrice, String cameraPrice, int ProcessorPrice) {
		int total4 = ramPrice*Integer.parseInt(cameraPrice)+ProcessorPrice;
		System.out.println("Total numbers from materials: " + total4);
		return total4;
	}
	@Override
	public int materials(String ramPrice, int cameraPrice, String ProcessorPrice) {
		int total5 = Integer.parseInt(ramPrice)+cameraPrice/Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total5);
		return total5;
	}
	@Override
	public int materials(int ramPrice, String cameraPrice, String ProcessorPrice) {
		int total6 = ramPrice+Integer.parseInt(cameraPrice)*Integer.parseInt(ProcessorPrice);
		System.out.println("Total numbers from materials: " + total6);
		return total6;
	}

	@Override
	public void materials(int ramPrice, String cameraPrice, int ProcessorPrice, int a) {
		int total9 = ramPrice * Integer.parseInt(cameraPrice) * ProcessorPrice + a;
		System.out.println("Total numbers from materials: " + total9);
	}
	@Override
	public void materials() {
		System.out.println("Void method materials");
	}
	/*
	 * We cannot use voit type parameterized return type Void type parameterized is
	 * implemented
	 

	public final int materials(int ramPrice, int cameraPrice, int ProcessorPrice) {
		int total7 = ramPrice + cameraPrice + ProcessorPrice;
		return total7;

	}
	public static int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int maintenanceCost) {
		int total8 = ramPrice+cameraPrice+Integer.parseInt(ProcessorPrice)+maintenanceCost;
		return total8;
	}
	*/
	
}
